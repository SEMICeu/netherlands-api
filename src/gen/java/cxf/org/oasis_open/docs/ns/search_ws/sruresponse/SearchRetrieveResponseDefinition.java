
package org.oasis_open.docs.ns.search_ws.sruresponse;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.search_ws.facetedresults.FacetedResultsDefinition;
import org.oasis_open.docs.ns.search_ws.searchresultanalysis.SearchResultAnalysisDefinition;
import org.w3c.dom.Element;


/**
 * <p>Java class for searchRetrieveResponseDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchRetrieveResponseDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}version" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}numberOfRecords" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}resultSetId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}resultSetIdleTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}records" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}nextRecordPosition" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}echoedSearchRetrieveRequest" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}diagnostics" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}extraResponseData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}resultSetTTL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}resultCountPrecision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}facetedResults" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/ns/search-ws/sruResponse}searchResultAnalysis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRetrieveResponseDefinition", propOrder = {
    "version",
    "numberOfRecords",
    "resultSetId",
    "resultSetIdleTime",
    "records",
    "nextRecordPosition",
    "echoedSearchRetrieveRequest",
    "diagnostics",
    "extraResponseData",
    "any",
    "resultSetTTL",
    "resultCountPrecision",
    "facetedResults",
    "searchResultAnalysis"
})
public class SearchRetrieveResponseDefinition {

    protected String version;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfRecords;
    protected String resultSetId;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger resultSetIdleTime;
    protected RecordsDefinition records;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nextRecordPosition;
    protected EchoedSearchRetrieveRequestDefinition echoedSearchRetrieveRequest;
    protected DiagnosticsDefinition diagnostics;
    protected List<ExtensionDefinition> extraResponseData;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger resultSetTTL;
    protected List<String> resultCountPrecision;
    protected List<FacetedResultsDefinition> facetedResults;
    protected List<SearchResultAnalysisDefinition> searchResultAnalysis;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the numberOfRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Sets the value of the numberOfRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRecords(BigInteger value) {
        this.numberOfRecords = value;
    }

    /**
     * Gets the value of the resultSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultSetId() {
        return resultSetId;
    }

    /**
     * Sets the value of the resultSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSetId(String value) {
        this.resultSetId = value;
    }

    /**
     * Gets the value of the resultSetIdleTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultSetIdleTime() {
        return resultSetIdleTime;
    }

    /**
     * Sets the value of the resultSetIdleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultSetIdleTime(BigInteger value) {
        this.resultSetIdleTime = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link RecordsDefinition }
     *     
     */
    public RecordsDefinition getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordsDefinition }
     *     
     */
    public void setRecords(RecordsDefinition value) {
        this.records = value;
    }

    /**
     * Gets the value of the nextRecordPosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNextRecordPosition() {
        return nextRecordPosition;
    }

    /**
     * Sets the value of the nextRecordPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNextRecordPosition(BigInteger value) {
        this.nextRecordPosition = value;
    }

    /**
     * Gets the value of the echoedSearchRetrieveRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EchoedSearchRetrieveRequestDefinition }
     *     
     */
    public EchoedSearchRetrieveRequestDefinition getEchoedSearchRetrieveRequest() {
        return echoedSearchRetrieveRequest;
    }

    /**
     * Sets the value of the echoedSearchRetrieveRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EchoedSearchRetrieveRequestDefinition }
     *     
     */
    public void setEchoedSearchRetrieveRequest(EchoedSearchRetrieveRequestDefinition value) {
        this.echoedSearchRetrieveRequest = value;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticsDefinition }
     *     
     */
    public DiagnosticsDefinition getDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticsDefinition }
     *     
     */
    public void setDiagnostics(DiagnosticsDefinition value) {
        this.diagnostics = value;
    }

    /**
     * Gets the value of the extraResponseData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraResponseData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraResponseData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionDefinition }
     * 
     * 
     */
    public List<ExtensionDefinition> getExtraResponseData() {
        if (extraResponseData == null) {
            extraResponseData = new ArrayList<ExtensionDefinition>();
        }
        return this.extraResponseData;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the resultSetTTL property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultSetTTL() {
        return resultSetTTL;
    }

    /**
     * Sets the value of the resultSetTTL property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultSetTTL(BigInteger value) {
        this.resultSetTTL = value;
    }

    /**
     * Gets the value of the resultCountPrecision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultCountPrecision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultCountPrecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResultCountPrecision() {
        if (resultCountPrecision == null) {
            resultCountPrecision = new ArrayList<String>();
        }
        return this.resultCountPrecision;
    }

    /**
     * Gets the value of the facetedResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facetedResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacetedResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacetedResultsDefinition }
     * 
     * 
     */
    public List<FacetedResultsDefinition> getFacetedResults() {
        if (facetedResults == null) {
            facetedResults = new ArrayList<FacetedResultsDefinition>();
        }
        return this.facetedResults;
    }

    /**
     * Gets the value of the searchResultAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResultAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResultAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResultAnalysisDefinition }
     * 
     * 
     */
    public List<SearchResultAnalysisDefinition> getSearchResultAnalysis() {
        if (searchResultAnalysis == null) {
            searchResultAnalysis = new ArrayList<SearchResultAnalysisDefinition>();
        }
        return this.searchResultAnalysis;
    }

}
