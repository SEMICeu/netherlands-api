package io.swagger.model;

import io.swagger.model.PublicService;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldRemoteContext;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.api.GenericReport;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

@JsonldRemoteContext(value="https://raw.githubusercontent.com/catalogue-of-services-isa/CPSV-AP/master/releases/2.2.1/CPSV-AP_v2.2.1.jsonld")
@JsonldType("http://data.europa.eu/m8g/PublicServiceDataset")
public class PublicServiceDataset implements GenericReport {

  @XmlElement(name = "PublicService")
  @ApiModelProperty(value = "PublicService") 
  @XmlElementWrapper(name = "hasPart")
  @Valid
  private List<PublicService> hasPart = null;
 /**
   * Get hasPart
   * @return hasPart
  **/
  public List<PublicService> getHasPart() {
    return hasPart;
  }

 
  public void setHasPart(List<PublicService> hasPart) {
    this.hasPart = hasPart;
  }

  public PublicServiceDataset hasPart(List<PublicService> hasPart) {
    this.hasPart = hasPart;
    return this;
  }

  public PublicServiceDataset addHasPartItem(PublicService hasPartItem) {
    this.hasPart.add(hasPartItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicServiceDataset {\n");
    
    sb.append("    hasPart: ").append(toIndentedString(hasPart)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

