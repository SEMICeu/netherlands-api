package io.swagger.model;

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

public class Report implements GenericReport {
  
  @ApiModelProperty(value = "")
  private List<Integer> violations = null;

  @ApiModelProperty(value = "")
  private List<Integer> warnings = null;

  @ApiModelProperty(value = "")
  private List<Integer> info = null;

  @ApiModelProperty(value = "")
  private List<String> dates = null;
 /**
   * Get violations
   * @return violations
  **/
  @JsonProperty("violations")
  public List<Integer> getViolations() {
    return violations;
  }

  public void setViolations(List<Integer> violations) {
    this.violations = violations;
  }

  public Report violations(List<Integer> violations) {
    this.violations = violations;
    return this;
  }

  public Report addViolationsItem(Integer violationsItem) {
    this.violations.add(violationsItem);
    return this;
  }

 /**
   * Get warnings
   * @return warnings
  **/
  @JsonProperty("warnings")
  public List<Integer> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<Integer> warnings) {
    this.warnings = warnings;
  }

  public Report warnings(List<Integer> warnings) {
    this.warnings = warnings;
    return this;
  }

  public Report addWarningsItem(Integer warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
   * Get info
   * @return info
  **/
  @JsonProperty("info")
  public List<Integer> getInfo() {
    return info;
  }

  public void setInfo(List<Integer> info) {
    this.info = info;
  }

  public Report info(List<Integer> info) {
    this.info = info;
    return this;
  }

  public Report addInfoItem(Integer infoItem) {
    this.info.add(infoItem);
    return this;
  }

 /**
   * Get dates
   * @return dates
  **/
  @JsonProperty("dates")
  public List<String> getDates() {
    return dates;
  }

  public void setDates(List<String> dates) {
    this.dates = dates;
  }

  public Report dates(List<String> dates) {
    this.dates = dates;
    return this;
  }

  public Report addDatesItem(String datesItem) {
    this.dates.add(datesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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

