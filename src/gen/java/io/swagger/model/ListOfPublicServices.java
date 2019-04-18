package io.swagger.model;

import io.swagger.model.PublicService;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldRemoteContext;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.api.GenericReport;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonldRemoteContext(value="https://raw.githubusercontent.com/catalogue-of-services-isa/netherlands-api/master/src/main/resources/CPSV-AP_v2.2.1.jsonld")
@JsonldType("http://data.europa.eu/m8g/PublicServiceDataset")
public class ListOfPublicServices implements GenericReport {
  
  @ApiModelProperty(value = "")
  private List<PublicService> hasPublicService = null;
 /**
   * Get hasPublicService
   * @return hasPublicService
  **/
  @JsonProperty("hasPublicService")
  public List<PublicService> getHasPublicService() {
    return hasPublicService;
  }

  public void setHasPublicService(List<PublicService> hasPublicService) {
    this.hasPublicService = hasPublicService;
  }

  public ListOfPublicServices hasPublicService(List<PublicService> hasPublicService) {
    this.hasPublicService = hasPublicService;
    return this;
  }

  public ListOfPublicServices addHasPublicServiceItem(PublicService hasPublicServiceItem) {
    this.hasPublicService.add(hasPublicServiceItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfPublicServices {\n");
    
    sb.append("    hasPublicService: ").append(toIndentedString(hasPublicService)).append("\n");
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

