package io.swagger.api;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.cxf.interceptor.AbstractOutDatabindingInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.jaxrs.model.OperationResourceInfo;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

public class CacheInterceptor extends AbstractOutDatabindingInterceptor{
   public CacheInterceptor() {
       super(Phase.MARSHAL);
   }

   @Override
   public void handleMessage(Message outMessage) throws Fault {
       //search for a CacheControl annotation on the operation
       OperationResourceInfo resourceInfo = outMessage.getExchange().get(OperationResourceInfo.class);
       CacheControl cacheControl = null;
       for (Annotation annot : resourceInfo.getOutAnnotations()) {
           if(annot instanceof CacheControl) {
               cacheControl = (CacheControl) annot;
               break;
           }
       }

       //fast path for no cache control
       if(cacheControl == null) {
           return;
       }

       //search for existing headers or create new ones
       Map<String, List<String>> headers = (Map<String, List<String>>) outMessage.get(Message.PROTOCOL_HEADERS);
       if (headers == null) {
           headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
           outMessage.put(Message.PROTOCOL_HEADERS, headers);
       }

       //add Cache-Control header
       headers.put("Cache-Control", Collections.singletonList(cacheControl.value()));
   }
}