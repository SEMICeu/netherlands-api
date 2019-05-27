package io.swagger.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.protobuf.ProtobufMapper;
import com.fasterxml.jackson.dataformat.protobuf.schema.NativeProtobufSchema;
import com.fasterxml.jackson.dataformat.protobuf.schema.ProtobufSchema;

public class ProtoGenerator {



   public static void generate(String report, String folder){
   	final ProtobufMapper mapper = new ProtobufMapper();
   	ProtobufSchema schemaWrapper = null;
   	NativeProtobufSchema nativeProtobufSchema;
//       System.out.println("proto constructor");
//   	System.out.print("proto report is:"+ report);
   	String classname = "";
       try {
       	Class<?> classe = Class.forName(report);
schemaWrapper = mapper.generateSchemaFor(classe);
classname = classe.getSimpleName();

} catch (JsonMappingException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
       nativeProtobufSchema = schemaWrapper.getSource();
       try {
PrintWriter out = new PrintWriter(new File(folder + classname + ".proto"));
out.println(schemaWrapper.toString());
out.close();
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
   }
   
   public static void main(String[] args) {
   	generate(args[0],args[1]);
   }
}