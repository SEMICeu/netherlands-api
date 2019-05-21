package io.swagger.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecord;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroMapper;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.protobuf.ProtobufFactory;
import com.fasterxml.jackson.dataformat.protobuf.ProtobufMapper;
import com.fasterxml.jackson.dataformat.protobuf.schema.NativeProtobufSchema;
import com.fasterxml.jackson.dataformat.protobuf.schema.ProtobufSchema;

import io.swagger.api.GenericReport;

@Provider
@Consumes("application/protobuf")
@Produces("application/protobuf")
public class ProtobufProvider implements MessageBodyWriter<GenericReport>, MessageBodyReader<GenericReport>, BinaryProvider
{

	final ProtobufMapper mapper = new ProtobufMapper();
	ProtobufSchema schemaWrapper;
	NativeProtobufSchema nativeProtobufSchema;

    public ProtobufProvider(String report){
        System.out.println("proto constructor");
    	System.out.print("proto report is:"+ report);
        try {
			schemaWrapper = mapper.generateSchemaFor(Class.forName(report));
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        nativeProtobufSchema = schemaWrapper.getSource();
    }
    
	@Override
	public boolean isReadable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		System.out.println("proto is readable");
		return true;
	}

	@Override
	public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		System.out.println("proto is writeable");
        return true;
	}


	@Override
	public GenericReport readFrom(Class<GenericReport> arg0, Type arg1, Annotation[] arg2, MediaType arg3,
			MultivaluedMap<String, String> arg4, InputStream arg5) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		System.out.println("proto read from");
		GenericReport report = mapper.readerFor(arg0).with(schemaWrapper).readValue(arg5);
		//.reader(GenericReport.class).with(schema).readValue(arg5);
				
		return report;
	}

	@Override
	public long getSize(GenericReport arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		// TODO Auto-generated method stub
		System.out.println("proto get size");
		return -1;
	}

	@Override
	public void writeTo(GenericReport arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4,
			MultivaluedMap<String, Object> arg5, OutputStream arg6) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		
		System.out.println("proto write to");
		ProtobufSchema schemaWrapper = mapper.generateSchemaFor(arg1);
	    mapper.writer(schemaWrapper).writeValue(arg6, arg0);
	    
//		System.out.println("proto write to");
//	    byte[] myarray = mapper.writer(schemaWrapper).writeValueAsBytes(arg0);
//	    StringBuilder sb = new StringBuilder();
//	    for (byte b : myarray) {
//	        sb.append(String.format("%02X ", b));
//	    }
//	    System.out.println("myarray:" + sb.toString());
//	    System.out.println(myarray.length);
//	    arg6.write(myarray);
	}
}
