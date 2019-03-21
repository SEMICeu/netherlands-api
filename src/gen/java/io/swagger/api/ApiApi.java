package io.swagger.api;

import io.swagger.model.ListOfRules;
import io.swagger.model.Report;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Dashboard API
 *
 * <p>Dashboard API.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ApiApi  {

    /**
     * Get Aggregated Report
     *
     * Get an aggregated report given the profile
     *
     */
    @GET
    @Path("/aggregatedReport")
    @Produces({ "application/json", "application/xml", "application/ld+json", "application/x-jackson-smile", "avro/binary", "application/cbor", "application/protobuf", "application/ion", "application/msgpack", "application/bson" })
    @ApiOperation(value = "Get Aggregated Report", tags={ "api",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Report.class),
        @ApiResponse(code = 400, message = "Invalid status value") })
    public Report getAggregatedReport(@QueryParam("profile") @DefaultValue("DCAT-AP-ASIP") String profile);

    /**
     * Most violated rules
     *
     * Get the most violated rules
     *
     */
    @GET
    @Path("/mostViolatedRules")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Most violated rules", tags={ "api",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ListOfRules.class),
        @ApiResponse(code = 400, message = "Invalid status value") })
    public ListOfRules mostViolatedRules(@QueryParam("profile") @DefaultValue("DCAT-AP-ASIP") String profile);

    /**
     * Send Report
     *
     * Send report
     *
     */
    @POST
    @Path("/report")
    @Consumes({ "text/turtle" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Send Report", tags={ "api" })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    public void sendReport(@Valid String body, @QueryParam("profile") @DefaultValue("DCAT-AP-ASIP") String profile);
}

