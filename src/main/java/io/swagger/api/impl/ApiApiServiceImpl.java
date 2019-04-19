package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.Concept;
import io.swagger.model.Language;
import io.swagger.model.Location;
import io.swagger.model.PublicOrganisation;
import io.swagger.model.PublicService;
import io.swagger.model.PublicServiceDataset;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

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
    public PublicServiceDataset getPublicServices(String startRecord, String maximumRecords, String query) {
    	List<PublicService> publicServiceList = new ArrayList<PublicService>();
    	PublicService ps1 = new PublicService();
    	PublicOrganisation po1 = new PublicOrganisation();
    	Concept co1 = new Concept();
    	co1.setId("http://netherlands/example/skos/concept/test/123");
    	Language lg1 = new Language();
    	lg1.setId("http://URIofPublication/office/ITA");
    	Location lo1 = new Location(); 
    	lo1.setId("http://netherlands/ITA/Trento");
    	
    	ps1.setId("http://netherlands/example/PS/1234");
    	ps1.setTitle("Groenland");
    	ps1.setType(co1);
    	ps1.setLanguage(lg1);
    	ps1.setSpatial(lo1);
    	ps1.setDescription("This is a test of description");
    	ps1.setModified("2018-07-23");
    	
    	
    	po1.setId("http://netherlands/example/PO/5678");
    	ps1.setHasCompetentAuthority(po1);
    	po1.setSpatial(lo1);
    	publicServiceList.add(ps1);
    	
    	PublicServiceDataset dataset = new PublicServiceDataset();
    	dataset.setHasPublicService(publicServiceList);
		
        return dataset; 
    }
    
}

