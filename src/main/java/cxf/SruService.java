package cxf;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.w3c.dom.Node;

import gov.loc.zing.srw.ObjectFactory;
import gov.loc.zing.srw.RecordDefinition;
import gov.loc.zing.srw.RecordsDefinition;
import gov.loc.zing.srw.SearchRetrieveResponseDefinition;
import gov.loc.zing.srw.StringOrXmlFragmentDefinition;
import nl.overheid.standaarden.product.terms.Scproduct;
import test.GzdDataComplexType;

public class SruService {

	public static void main(String[] args) {
				
		// Firing a HTTP GET request with (optionally) query parameters    	
//    	String url1 = "http://zoekdienst.overheid.nl/SRUServices/SRUServices.asmx/Search";
    	String url1 = "http://localhost/netherlands/SRUResponse.xml";
    	
    	String charset = "UTF-8";
    	String param1 = "1.2"; 
    	String param2 = "searchRetrieve";
    	String param3 = "sc";
    	String param4 = "sc4.0";
    	String param5 = "1";
    	String param6 = "10";
    	String param7 = "authority=\"Gelderland\"";
    	
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
		try {
			String url = url1;
			connection = (HttpURLConnection) new URL(url).openConnection();
			System.out.println(url);
			connection.setRequestProperty("Accept-Charset", charset);
			
			JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
			InputStream xml = connection.getInputStream();
			SearchRetrieveResponseDefinition response = ((JAXBElement<SearchRetrieveResponseDefinition>) jc.createUnmarshaller().unmarshal(xml)).getValue();
			System.out.println(response.getNumberOfRecords().toString());
			RecordsDefinition records = response.getRecords();
		    Object record = records.getRecord().get(0).getRecordData().getContent().get(1);
			System.out.println("test"+record.toString());
			
			//GzdDataComplexType gzdData = new test.ObjectFactory().createGzd((GzdDataComplexType) record).getValue();
			JAXBContext jc2 = JAXBContext.newInstance(GzdDataComplexType.class);
			GzdDataComplexType gzdData= ((JAXBElement<GzdDataComplexType>) jc2.createUnmarshaller().unmarshal((Node) record)).getValue();
			Object auth = gzdData.getEnrichedData().getAny().get(0);
			System.out.println("size"+((Node)auth).getTextContent());
			
			Object scproduct = gzdData.getOriginalData().getAny().get(0);
			JAXBContext jc3 = JAXBContext.newInstance(Scproduct.class);
			Scproduct scProduct = ((Scproduct) jc3.createUnmarshaller().unmarshal((Node) scproduct));
			
			System.out.println("identifier"+scProduct.getMeta().getOwmskern().getIdentifier());
			
			
			
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
		
//		SearchRetrieveService service = new SearchRetrieveService();
//		SearchRetrievePortType operation = service.getSearchRetrievePort();
//		SearchRetrieveRequestType searchRetrieveRequest = new SearchRetrieveRequestType();
//		searchRetrieveRequest.setQuery("authority='Gelderland'");
//		searchRetrieveRequest.setStartRecord(new BigInteger("1"));
//		searchRetrieveRequest.setMaximumRecords(new BigInteger("10"));
//		searchRetrieveRequest.setRecordSchema("sc4.0");
		
		
//		SearchRetrieveResponseDefinition response = operation.searchRetrieve(searchRetrieveRequest);
//		System.out.println(response.getNumberOfRecords().toString());
	}

}
