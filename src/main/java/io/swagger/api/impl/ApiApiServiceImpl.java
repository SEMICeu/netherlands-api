package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ListOfRules;
import io.swagger.model.Report;
import io.swagger.model.Rule;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Dashboard API
 *
 * <p>Dashboard API.
 *
 */
public class ApiApiServiceImpl implements ApiApi {
    /**
     * Get Aggregated Report
     *
     * Get an aggregated report given the profile
     *
     */
	@CacheControl("max-age=120")
	public Report getAggregatedReport(String profile) {
//    	Firing a HTTP GET request with (optionally) query parameters    	
    	String url1 = "http://localhost:8890/sparql-graph-crud";
    	String charset = "UTF-8";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
    	String param1 = "urn:graph:update:test:post"; 
    	String param2 = "prefix sh: <http://www.w3.org/ns/shacl#> "
    			      + "prefix dct: <http://purl.org/dc/terms/> "
    			      + "SELECT (sum(?isViolation) as ?violations) (sum(?isWarning) as ?warnings) (sum(?isInfo) as ?info) ?date "
    			      + "WHERE { "
    			      + "?report a sh:ValidationReport . "
    			      + "?report dct:profile ?profile . "
    			      + "?report dct:issued ?datetime . "
    			      + "BIND(STRBEFORE(?datetime, \"T\" ) as ?date) . "
    			      + "?report sh:result ?result. "
    			      + "?result sh:resultSeverity ?severity. "
    			      + "BIND(IF(?severity = sh:Violation, 1, 0) as ?isViolation) "
    			      + "BIND(IF(?severity = sh:Warning, 1, 0) as ?isWarning) "
    			      + "BIND(IF(?severity = sh:Info, 1, 0) as ?isInfo) "
    			      + "FILTER (?profile='" + profile + "') } " 
    			      + "ORDER BY ASC(?date)";
    	
    	
    	String query ="";
		try {
			query = String.format("graph-uri=%s&query=%s", 
			    URLEncoder.encode(param1, charset),
			    URLEncoder.encode(param2, charset));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

    	HttpURLConnection connection = null;
		ArrayList<Integer> resultviolations = new ArrayList<Integer>();
		ArrayList<Integer> resultwarnings = new ArrayList<Integer>();
		ArrayList<Integer> resultinfo = new ArrayList<Integer>();
		ArrayList<String> resultdate = new ArrayList<String>();
		try {
			connection = (HttpURLConnection) new URL(url1 + "?" + query).openConnection();
//			connection.setRequestProperty("Accept-Charset", charset);
			connection.setRequestProperty("Accept", "application/json" );
			String theString = IOUtils.toString(connection.getInputStream(), "UTF-8"); 
			JSONObject jsonResponse = new JSONObject(theString);
			JSONObject results = jsonResponse.getJSONObject("results");
			JSONArray jsonArray = results.getJSONArray("bindings");
            
			for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jObject = (JSONObject)jsonArray.get(i);
                JSONObject violations = jObject.getJSONObject("violations");
                resultviolations.add(Integer.parseInt(violations.getString("value")));
                
                JSONObject warnings = jObject.getJSONObject("warnings");
                resultwarnings.add(Integer.parseInt(warnings.getString("value")));
                
                JSONObject info = jObject.getJSONObject("info");
                resultinfo.add(Integer.parseInt(info.getString("value")));
                
                JSONObject date = jObject.getJSONObject("date");
				resultdate.add(date.getString("value"));
			}
	    	
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Report report = new Report();
    	List<Integer> violations = new ArrayList<Integer>();
    	for (Integer i : resultviolations) {
    		violations.add(i);
    	}
		report.setViolations(violations);
		
		List<Integer> warnings= new ArrayList<Integer>();
		for (Integer i : resultwarnings) {
    		warnings.add(i);
    	}
		report.setWarnings(warnings);
		
		List<Integer> info= new ArrayList<Integer>();
		for (Integer i : resultinfo) {
    		info.add(i);
    	}
		report.setInfo(info);
		
    	List<String> dates= new ArrayList<String>();
    	for (String i : resultdate) {
    		dates.add(i);
    	}
		report.setDates(dates);
		
        return report;
    }

		
		
//		ArrayList<Integer> resultviolations2 = new ArrayList<Integer>();
//		ArrayList<Integer> resultwarnings2 = new ArrayList<Integer>();
//		ArrayList<Integer> resultinfo2 = new ArrayList<Integer>();
//		ArrayList<String> resultdate2 = new ArrayList<String>();
//		
//		Random rand = new Random();
//		rand.setSeed(System.currentTimeMillis());
//		for (int i=0; i<300; i++)
//		{
//		    Integer r = rand.nextInt() % 256;
//		    resultviolations2.add(r);
//		    resultwarnings2.add(r);
//		    resultinfo2.add(r);
//		}
//		
//		long numOfDaysBetween = 300; 
//		LocalDate startDate = LocalDate.now();
//		resultdate2 = (ArrayList<String>) IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween).mapToObj(i -> startDate.plusDays(i).toString()).collect(Collectors.toList()); 
//		
//		Report report = new Report();
//    	List<Integer> violations = new ArrayList<Integer>();
//    	for (Integer i : resultviolations2) {
//    		violations.add(i);
//    	}
//		report.setViolations(violations);
//		
//		List<Integer> warnings= new ArrayList<Integer>();
//		for (Integer i : resultwarnings2) {
//    		warnings.add(i);
//    	}
//		report.setWarnings(warnings);
//		
//		List<Integer> info= new ArrayList<Integer>();
//		for (Integer i : resultinfo2) {
//    		info.add(i);
//    	}
//		report.setInfo(info);
//		
//    	List<String> dates= new ArrayList<String>();
//    	for (String i : resultdate2) {
//    		dates.add(i);
//    	}
//		report.setDates(dates);
//		
//        return report;
//    }
    
    /**
     * Most violated rules
     *
     * Get the most violated rules
     *
     */
    public ListOfRules mostViolatedRules(String profile) {
    	// Firing a HTTP GET request with (optionally) query parameters    	
    	String url1 = "http://localhost:8890/sparql-graph-crud";
    	String charset = "UTF-8";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
    	String param1 = "urn:graph:update:test:post"; 
    	String param2 = "prefix sh: <http://www.w3.org/ns/shacl#> "
    				  + "prefix dct: <http://purl.org/dc/terms/> "
    				  + "SELECT  (count(?violation) as ?violations) ?name "
    				  + "WHERE { "
    				  + "?vr a sh:ValidationResult . "
    				  + "?vr sh:resultMessage ?resultMessage . "
    				  + "?vr sh:resultPath ?resultPath . "
    				  + "?vr sh:resultSeverity ?resultSeverity . "
    				  + "?vr sh:sourceConstraintComponent ?sourceConstraintComponent . "
    				  + "?vr sh:sourceShape ?sourceShape . "
    				  + "?report dct:profile ?profile . "
    				  + "?report sh:result ?vr. "
    				  + "FILTER (?profile='"+ profile + "') . "
    				  + "FILTER (!isBlank(?sourceShape)) . "
    				  + "BIND(strafter(str(?sourceShape), \"http://esante.gouv.fr/profile/ns#\" ) as ?name) . "
    				  + "BIND(concat(str(?resultMessage), str(?resultPath), str(?resultSeverity), str(?sourceConstraintComponent), str(?sourceShape)) as ?violation) . "
    				  + "} "
    				  + "GROUP BY (?name) "
    				  + "ORDER BY DESC(?violations) "
    				  + "LIMIT 6";
    	
    	
    	String query ="";
		try {
			query = String.format("graph-uri=%s&query=%s", 
			    URLEncoder.encode(param1, charset),
			    URLEncoder.encode(param2, charset));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

    	HttpURLConnection connection = null;
    	
		ArrayList<Rule> resultViolations = new ArrayList<Rule>();
		try {
			connection = (HttpURLConnection) new URL(url1 + "?" + query).openConnection();
//			connection.setRequestProperty("Accept-Charset", charset);
			connection.setRequestProperty("Accept", "application/json" );
			String theString = IOUtils.toString(connection.getInputStream(), "UTF-8"); 
			JSONObject jsonResponse = new JSONObject(theString);
			JSONObject results = jsonResponse.getJSONObject("results");
			JSONArray jsonArray = results.getJSONArray("bindings");
            
			for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jObject = (JSONObject)jsonArray.get(i);
                JSONObject violations = jObject.getJSONObject("violations");
                Integer value = Integer.parseInt(violations.getString("value"));
          
                JSONObject date = jObject.getJSONObject("name");
                String name = date.getString("value"); 
                Rule temp = new Rule();
                temp.setName(name);
                temp.setValue(value);
                resultViolations.add(temp);
			}
	    	
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		ListOfRules rules = new ListOfRules();
		rules.setViolations(resultViolations);
    			
        return rules;
    }
    
    /**
     * Send Report
     *
     * Send report
     *
     */
public void sendReport(String body, String profile) {
    	
    	Model reportModel = ModelFactory.createDefaultModel() ;
    	InputStream stream = new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
    	String base = "http://example.com/";
		String lang = "TURTLE";
		reportModel.read(stream, base, lang);
    	
    	
    	String date = LocalDateTime.now().toString();
		String queryStr = "prefix sh: <http://www.w3.org/ns/shacl#> "
				+ "prefix dct: <http://purl.org/dc/terms/> "
				+ "construct { ?report dct:issued '" + date + "' . "
				+ "?report dct:profile '" + profile + "' } "
				+ "WHERE { ?report a sh:ValidationReport }";
		Query query = QueryFactory.create(queryStr);
		QueryExecution qe = QueryExecutionFactory.create(query, reportModel);
		Model reportModelwithDate = qe.execConstruct();
//		Model reportModelwithDate = queryResult.getResourceModel();
//		reportModelwithDate.setNsPrefix("sh", "http://www.w3.org/ns/shacl#");
		System.out.println(reportModelwithDate.toString());
		qe.close();
		reportModel.add(reportModelwithDate);
    	
    	
    	// Firing a HTTP POST request with query parameters
    			ByteArrayOutputStream out = new ByteArrayOutputStream();
    			reportModel.write(out, lang );
    			String rdfmodel = out.toString();
    			try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			HttpURLConnection urlCon = null;
    	    	try {
    	            URL virtuosoUpdateEndpoint = new URL("http://localhost:8890/sparql-graph-crud-auth?graph-uri=urn:graph:update:test:post");
    				urlCon = (HttpURLConnection)virtuosoUpdateEndpoint.openConnection();   
    				Authenticator.setDefault(new Authenticator() {
    				    protected PasswordAuthentication getPasswordAuthentication() {
    				        return new PasswordAuthentication("dba", "dba".toCharArray());
    				    }
    				});
    	            urlCon.setRequestProperty("content-type", "application/rdf+xml" );            
    	            urlCon.setDoOutput(true);          
    	            urlCon.setRequestMethod("POST"); 
    	            urlCon.setUseCaches(false);
    	            urlCon.connect();
    	            OutputStream urlOutStream = null;
    	            urlOutStream = urlCon.getOutputStream();
    	            OutputStreamWriter urlWriter = null;
    	            urlWriter = new OutputStreamWriter(urlOutStream, StandardCharsets.UTF_8);
    	            // String triple = "<http://example.org/#spiderman10> <http://www.perceive.net/schemas/relationship/enemyOf> <http://example.org/#green-goblin7> .";
    				urlWriter.write(rdfmodel);
    				urlWriter.flush(); 
    				urlWriter.close();
    				int rC = urlCon.getResponseCode();
    				String message = urlCon.getResponseMessage();
    				System.out.println(rC);
    				System.out.println(message);

    	        } catch (IOException ex) {
    	            if(urlCon!=null){
    	                urlCon.disconnect();
    	            }
    	        }
        
        
    }
    
}

