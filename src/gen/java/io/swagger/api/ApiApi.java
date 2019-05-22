package io.swagger.api;

import io.swagger.model.PublicServiceDataset;

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
 * Samenwerkende Catalogi CPSV-AP API
 *
 * <p>Samenwerkende Catalogi CPSV-AP API
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ApiApi  {

    /**
     * Get list of Public services
     *
     * Get a list of Public services
     *
     */
    @GET
    @Path("/PublicServices")
    @Produces({ "application/ld+json", "application/json", "application/xml", "application/x-jackson-smile", "avro/binary", "application/cbor", "application/protobuf", "application/ion", "application/msgpack", "application/bson" })
    @ApiOperation(value = "Get list of Public services", tags={ "api" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PublicServiceDataset.class),
        @ApiResponse(code = 400, message = "Invalid status value") })
    public PublicServiceDataset getPublicServices(@QueryParam("startRecord") @NotNull @DefaultValue("1") String startRecord, @QueryParam("maximumRecords") @NotNull @DefaultValue("10") String maximumRecords, @QueryParam("query") @NotNull String query);
}

