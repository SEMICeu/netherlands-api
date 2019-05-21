package io.swagger.model;

import io.swagger.model.Concept;
import io.swagger.model.Language;
import io.swagger.model.Location;
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
  private String id = null;

  @ApiModelProperty(value = "")
  private String title = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "")
  private Concept type = null;

  @ApiModelProperty(value = "")
  private Language language = null;

  @ApiModelProperty(value = "")
  private Location spatial = null;

  @ApiModelProperty(value = "")
  private PublicOrganisation hasCompetentAuthority = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PublicService id(String id) {
    this.id = id;
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

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PublicService description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public Concept getType() {
    return type;
  }

  public void setType(Concept type) {
    this.type = type;
  }

  public PublicService type(Concept type) {
    this.type = type;
    return this;
  }

 /**
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public PublicService language(Language language) {
    this.language = language;
    return this;
  }

 /**
   * Get spatial
   * @return spatial
  **/
  @JsonProperty("spatial")
  public Location getSpatial() {
    return spatial;
  }

  public void setSpatial(Location spatial) {
    this.spatial = spatial;
  }

  public PublicService spatial(Location spatial) {
    this.spatial = spatial;
    return this;
  }

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


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicService {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    spatial: ").append(toIndentedString(spatial)).append("\n");
    sb.append("    hasCompetentAuthority: ").append(toIndentedString(hasCompetentAuthority)).append("\n");
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

