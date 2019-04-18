package org.oasis_open.docs.ns.search_ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-04-18T17:10:41.700+02:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/ns/search-ws/soap", name = "SearchRetrievePortType")
@XmlSeeAlso({org.oasis_open.docs.ns.search_ws.diagnostic.ObjectFactory.class, org.oasis_open.docs.ns.search_ws.scan.ObjectFactory.class, org.oasis_open.docs.ns.search_ws.xcql.ObjectFactory.class, gov.loc.zing.srw.ObjectFactory.class, org.oasis_open.docs.ns.search_ws.searchresultanalysis.ObjectFactory.class, org.oasis_open.docs.ns.search_ws.facetedresults.ObjectFactory.class, org.oasis_open.docs.ns.search_ws.srurequest.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SearchRetrievePortType {

    @WebMethod(operationName = "SearchRetrieve", action = "urn:#SearchRetrieve")
    @WebResult(name = "searchRetrieveResponse", targetNamespace = "", partName = "searchRetrieveResponse")
    public gov.loc.zing.srw.SearchRetrieveResponseDefinition searchRetrieve(
        @WebParam(partName = "searchRetrieveRequest", name = "searchRetrieveRequest", targetNamespace = "")
        org.oasis_open.docs.ns.search_ws.srurequest.SearchRetrieveRequestType searchRetrieveRequest
    );
}
