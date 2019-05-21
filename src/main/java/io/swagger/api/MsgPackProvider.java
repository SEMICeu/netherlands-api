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
import org.apache.commons.io.IOUtils;
import org.msgpack.jackson.dataformat.MessagePackFactory;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroMapper;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;

import io.swagger.api.GenericReport;
import ioinformarics.oss.jackson.module.jsonld.JsonldModule;

@Provider
@Consumes("application/msgpack")
@Produces("application/msgpack")
public class MsgPackProvider implements MessageBodyWriter<GenericReport>, MessageBodyReader<GenericReport>, BinaryProvider
{

    final ObjectMapper mapper = new ObjectMapper(new MessagePackFactory()); 

    public MsgPackProvider(){
		System.out.println("msgpack constructor");
    }
    
	@Override
	public boolean isReadable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		System.out.println("msgpack is readable");
		return true;
	}

	@Override
	public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		System.out.println("msgpack is writeable");
        return true;
	}


	@Override
	public GenericReport readFrom(Class<GenericReport> arg0, Type arg1, Annotation[] arg2, MediaType arg3,
			MultivaluedMap<String, String> arg4, InputStream arg5) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		System.out.println("msgpack read from");
		GenericReport report = mapper.readerFor(arg0).readValue(arg5);
		//.reader(GenericReport.class).with(schema).readValue(arg5);
				
		return report;
	}

	@Override
	public long getSize(GenericReport arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		// TODO Auto-generated method stub
		System.out.println("msgpack get size");
		return -1;
	}

	@Override
	public void writeTo(GenericReport arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4,
			MultivaluedMap<String, Object> arg5, OutputStream arg6) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		
		System.out.println("msgpack write to");
		mapper.writerFor(arg1).writeValue(arg6, arg0);
		
//		System.out.println("msgpack write to");
//	    byte[] myarray = mapper.writerFor(arg1).writeValueAsBytes(arg0);
//	    StringBuilder sb = new StringBuilder();
//	    for (byte b : myarray) {
//	        sb.append(String.format("%02X ", b));
//	    }
//	    System.out.println("myarray:" + sb.toString());
//	    System.out.println(myarray.length);
//	    arg6.write(myarray);
	}
}
