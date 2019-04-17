package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ListOfPublicServices;
import io.swagger.model.PublicService;

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
    public ListOfPublicServices getPublicServices(String startRecord, String maximumRecords, String query) {
        // TODO: Implement...
    	
    	ListOfPublicServices publicServices = new ListOfPublicServices();
    	
    	List<PublicService> publicServicesList = new ArrayList<PublicService>();
    	PublicService arg0 = new PublicService();
    	arg0.setName("Groenland");
		publicServicesList.add(arg0);
		publicServices.setPublicServicesList(publicServicesList);
        
        return publicServices;
    }
    
}

