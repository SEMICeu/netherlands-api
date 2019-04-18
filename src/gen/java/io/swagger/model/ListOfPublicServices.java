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
  private List<PublicService> publicServicesList = null;
 /**
   * Get publicServicesList
   * @return publicServicesList
  **/
  @JsonProperty("publicServicesList")
  public List<PublicService> getPublicServicesList() {
    return publicServicesList;
  }

  public void setPublicServicesList(List<PublicService> publicServicesList) {
    this.publicServicesList = publicServicesList;
  }

  public ListOfPublicServices publicServicesList(List<PublicService> publicServicesList) {
    this.publicServicesList = publicServicesList;
    return this;
  }

  public ListOfPublicServices addPublicServicesListItem(PublicService publicServicesListItem) {
    this.publicServicesList.add(publicServicesListItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfPublicServices {\n");
    
    sb.append("    publicServicesList: ").append(toIndentedString(publicServicesList)).append("\n");
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

