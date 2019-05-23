package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.Concept;
import io.swagger.model.Language;
import io.swagger.model.Location;
import io.swagger.model.PublicOrganisation;
import io.swagger.model.PublicService;
import io.swagger.model.PublicServiceDataset;
import nl.overheid.standaarden.product.terms.Scproduct;
import nl.overheid.standaarden.product.terms.UniformeProductnaam;
import nl.overheid.standaarden.product.terms.Body.ProductHTML;
import nl.overheid.standaarden.product.terms.Meta.Owmskern;
import nl.overheid.standaarden.product.terms.Meta.Scmeta;
import test.GzdDataComplexType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;
import org.w3c.dom.Node;

import cxf.SruObject;
import gov.loc.zing.srw.ObjectFactory;
import gov.loc.zing.srw.RecordsDefinition;
import gov.loc.zing.srw.SearchRetrieveResponseDefinition;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Samenwerkende Catalogi CPSV-AP API
 *
 * <p>Samenwerkende Catalogi CPSV-AP API
 *
 */
public class ApiApiServiceImpl implements ApiApi {
    /**
     * Get list of Public services
     *
     * Get a list of Public services
     *
     */
	@CacheControl("max-age=600")
    public PublicServiceDataset getPublicServices(String startRecord, String maximumRecords, String query) {
    	
    	PublicServiceDataset dataset = new PublicServiceDataset();
    	System.out.println("startrecord:"+startRecord);
    	System.out.println("maximumRecords:"+maximumRecords);
    	System.out.println("query:"+query);
    	try {
    	SearchRetrieveResponseDefinition response = getResponse("http://zoekdienst.overheid.nl/SRUServices/SRUServices.asmx/Search", startRecord, maximumRecords, query);
    	int records = response.getRecords().getRecord().size();
    	System.out.println("*********************************************************************************Number of Records: "+ records);
    	
    	List<PublicService> publicServiceList = new ArrayList<PublicService>();
    
    	for (int i = 0; i < records; i++) {
    		SruObject sru = getSRUObject(response, i);
    		PublicService ps1 = new PublicService();
        	PublicOrganisation po1 = new PublicOrganisation();
        	
            Integer sizeOfConcept = sru.getPublicService_type().size();
        	
        	if (sizeOfConcept > 0) {
        		for (int n = 0; n < sizeOfConcept; n++) {
        			Concept co1 = new Concept();
        			co1.setId(sru.getPublicService_type().get(n));
        			ps1.setType(co1);
        		} 		
        	}
        	
        	Integer sizeOfLanguage = sru.getPublicService_language().size();
        	
        	if (sizeOfLanguage > 0) {
        		for (int n = 0; n < sizeOfLanguage; n++) {
	        		Language lg1 = new Language();
	        		lg1.setId(getMDRLanguage(sru.getPublicService_language().get(n)));
	        		ps1.setLanguage(lg1);
        		}
        		
        	}
        	Integer sizeOfLocation = sru.getPublicService_spatial().size();
        	
        	if (sizeOfLocation > 0) {
        		for (int n = 0; n < sizeOfLocation; n++) {
        			Location lo1 = new Location(); 
        			lo1.setId(sru.getPublicService_spatial().get(n));
        			ps1.setSpatial(lo1);
        			po1.setSpatial(lo1);
        		} 		
        	}

        	ps1.setId(sru.getPublicService_id());
        	ps1.setTitle(sru.getPublicService_title());
        	ps1.setDescription(sru.getPublicService_description());
        	
        	po1.setId(sru.getPublicOrganisation_id());
        	ps1.setHasCompetentAuthority(po1);
        	
        	publicServiceList.add(ps1);		
    	}
    	
    	dataset.setHasPart(publicServiceList);
	
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    	
        return dataset; 
    }
    
	public String getMDRLanguage(String language) {
		String MDRLanguage ="";
		if(language.equals(new String("nl"))) {
			MDRLanguage = "http://publications.europa.eu/resource/authority/language/NLD";
		}
			
		return MDRLanguage;
	}
	
    public SruObject getSRUObject(SearchRetrieveResponseDefinition response, Integer index) throws JAXBException {
    
    	SruObject sru = new SruObject();
    	
    	RecordsDefinition records = response.getRecords();
	    Object record = records.getRecord().get(index).getRecordData().getContent().get(1);
		// Get the OWMS kern
	    JAXBContext jc2 = JAXBContext.newInstance(GzdDataComplexType.class);
		GzdDataComplexType gzdData= ((JAXBElement<GzdDataComplexType>) jc2.createUnmarshaller().unmarshal((Node) record)).getValue();
		Object scproduct = gzdData.getOriginalData().getAny().get(0);
		JAXBContext jc3 = JAXBContext.newInstance(Scproduct.class);
		Scproduct scProduct = ((Scproduct) jc3.createUnmarshaller().unmarshal((Node) scproduct));
		
		Owmskern publicService = scProduct.getMeta().getOwmskern();
		System.out.println("Identifier: "+publicService.getIdentifier());
		sru.setPublicService_id(publicService.getIdentifier());
		
		System.out.println("Title: "+publicService.getTitle().getValue());
		sru.setPublicService_title(publicService.getTitle().getValue());
		
		System.out.println("Modified: "+publicService.getModified());
		sru.setPublicService_modified(publicService.getModified());
		
		List<String> listOfLanguages = publicService.getLanguage();
		for (int i = 0; i < listOfLanguages.size(); i++) {
			System.out.println("Language: "+publicService.getLanguage().get(i));
		}
		sru.setPublicService_language(listOfLanguages);
		
		List<org.purl.dc.terms.Location> listOfSpatials = publicService.getSpatial();
		List<String> listOfSpatialStrings = new ArrayList<String>();
		for (int i = 0; i < listOfSpatials.size(); i++) {
			System.out.println("Spatial: "+publicService.getSpatial().get(i).getResourceIdentifier());
			listOfSpatialStrings.add(publicService.getSpatial().get(i).getResourceIdentifier());
		}
		sru.setPublicService_spatial(listOfSpatialStrings);
		
		System.out.println("Competent Authority: "+publicService.getAuthority().get(0).getResourceIdentifier());
		sru.setPublicOrganisation_id(publicService.getAuthority().get(0).getResourceIdentifier());
		
		// Get the SC-specifieke metadata
		Scmeta scmeta = scProduct.getMeta().getScmeta();
					
		List<UniformeProductnaam> listOfTypes = scmeta.getUniformeProductnaam();
		List<String> listOfTypeStrings = new ArrayList<String>();
		for (int i = 0; i < listOfTypes.size(); i++) {
		    System.out.println("Type: "+ listOfTypes.get(i).getResourceIdentifier());
		    listOfTypeStrings.add(listOfTypes.get(i).getResourceIdentifier());
		}
		sru.setPublicService_type(listOfTypeStrings);
		
		// Get the ProductHTML	
		ProductHTML HTMLDescription = scProduct.getBody().getProductHTML();
		System.out.println("HTML Description: "+ HTMLDescription.getContent().get(0).toString());
		sru.setPublicService_description(HTMLDescription.getContent().get(0).toString());
		
		// Get the Enriched Data
		//GzdDataComplexType gzdData = new test.ObjectFactory().createGzd((GzdDataComplexType) record).getValue();
		Object auth1 = gzdData.getEnrichedData().getAny().get(1);
		Object auth2 = gzdData.getEnrichedData().getAny().get(3);
		System.out.println("AuthorityURI: "+((Node)auth1).getTextContent());
		sru.setPublicOrganisation_id(((Node)auth1).getTextContent());
		System.out.println("SpatialURI: "+((Node)auth2).getTextContent());
		sru.setPublicOrganisation_spatial(((Node)auth2).getTextContent());
		
    	return sru;
    }
    
    public SearchRetrieveResponseDefinition getResponse(String url1, String startRecord, String maximumRecords, String queryString) throws MalformedURLException, IOException, JAXBException {
    	
		// Firing a HTTP GET request with (optionally) query parameters    	
//    	String url1 = "http://zoekdienst.overheid.nl/SRUServices/SRUServices.asmx/Search";
//    	String url1 = "http://localhost/netherlands/SRUResponse.xml";
    	
    	String charset = "UTF-8";
    	String param1 = "1.2"; 
    	String param2 = "searchRetrieve";
    	String param3 = "sc";
    	String param4 = "sc4.0";
    	String param5 = startRecord;
    	String param6 = maximumRecords;
    	String param7 = queryString;
    	
    	String query ="";
		try {
			query = String.format("version=%s&operation=%s&x-connection=%s&recordSchema=%s&startRecord=%s&maximumRecords=%s&query=%s", 
			    URLEncoder.encode(param1, charset),
			    URLEncoder.encode(param2, charset),
			    URLEncoder.encode(param3, charset),
			    URLEncoder.encode(param4, charset),
			    URLEncoder.encode(param5, charset),
			    URLEncoder.encode(param6, charset),
			    URLEncoder.encode(param7, charset));
			    
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

    	HttpURLConnection connection;
			String url = url1 + "?" + query;
			connection = (HttpURLConnection) new URL(url).openConnection();
			System.out.println(url);
			connection.setRequestProperty("Accept-Charset", charset);
			
			// Get the number of Records
			JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
			InputStream xml = connection.getInputStream();
			SearchRetrieveResponseDefinition response = ((JAXBElement<SearchRetrieveResponseDefinition>) jc.createUnmarshaller().unmarshal(xml)).getValue();
		return response;
    }     
}


