package io.swagger.model;

import io.swagger.model.PublicOrganisation;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonldType("http://purl.org/vocab/cpsv#PublicService")
public class PublicService  {
  
  @ApiModelProperty(value = "")
  private PublicOrganisation hasCompetentAuthority = null;

  @ApiModelProperty(value = "")
  private String title = null;
 /**
   * Get hasCompetentAuthority
   * @return hasCompetentAuthority
  **/
  @JsonProperty("hasCompetentAuthority")
  public PublicOrganisation getHasCompetentAuthority() {
    return hasCompetentAuthority;
  }

  public void setHasCompetentAuthority(PublicOrganisation hasCompetentAuthority) {
    this.hasCompetentAuthority = hasCompetentAuthority;
  }

  public PublicService hasCompetentAuthority(PublicOrganisation hasCompetentAuthority) {
    this.hasCompetentAuthority = hasCompetentAuthority;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PublicService title(String title) {
    this.title = title;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicService {\n");
    
    sb.append("    hasCompetentAuthority: ").append(toIndentedString(hasCompetentAuthority)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

