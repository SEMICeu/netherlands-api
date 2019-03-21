package io.swagger.model;

import io.swagger.model.Rule;
import java.util.ArrayList;
import java.util.List;
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

public class ListOfRules  {
  
  @ApiModelProperty(value = "")
  private List<Rule> violations = null;
 /**
   * Get violations
   * @return violations
  **/
  @JsonProperty("violations")
  public List<Rule> getViolations() {
    return violations;
  }

  public void setViolations(List<Rule> violations) {
    this.violations = violations;
  }

  public ListOfRules violations(List<Rule> violations) {
    this.violations = violations;
    return this;
  }

  public ListOfRules addViolationsItem(Rule violationsItem) {
    this.violations.add(violationsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfRules {\n");
    
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
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

