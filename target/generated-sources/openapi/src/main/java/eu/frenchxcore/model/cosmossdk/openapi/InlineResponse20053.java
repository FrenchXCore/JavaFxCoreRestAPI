/*
 * Cosmos SDK - gRPC Gateway docs
 * A REST interface for state queries
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.frenchxcore.model.cosmossdk.openapi;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20053ModuleVersions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryModuleVersionsResponse is the response type for the Query/ModuleVersions RPC method.
 */
@ApiModel(description = "QueryModuleVersionsResponse is the response type for the Query/ModuleVersions RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class InlineResponse20053 {
  public static final String SERIALIZED_NAME_MODULE_VERSIONS = "module_versions";
  @SerializedName(SERIALIZED_NAME_MODULE_VERSIONS)
  private List<InlineResponse20053ModuleVersions> moduleVersions = null;


  public InlineResponse20053 moduleVersions(List<InlineResponse20053ModuleVersions> moduleVersions) {
    
    this.moduleVersions = moduleVersions;
    return this;
  }

  public InlineResponse20053 addModuleVersionsItem(InlineResponse20053ModuleVersions moduleVersionsItem) {
    if (this.moduleVersions == null) {
      this.moduleVersions = new ArrayList<InlineResponse20053ModuleVersions>();
    }
    this.moduleVersions.add(moduleVersionsItem);
    return this;
  }

   /**
   * module_versions is a list of module names with their consensus versions.
   * @return moduleVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "module_versions is a list of module names with their consensus versions.")

  public List<InlineResponse20053ModuleVersions> getModuleVersions() {
    return moduleVersions;
  }


  public void setModuleVersions(List<InlineResponse20053ModuleVersions> moduleVersions) {
    this.moduleVersions = moduleVersions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20053 inlineResponse20053 = (InlineResponse20053) o;
    return Objects.equals(this.moduleVersions, inlineResponse20053.moduleVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20053 {\n");
    sb.append("    moduleVersions: ").append(toIndentedString(moduleVersions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

