package eu.frenchxcore.cosmossdk.query.mint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.frenchxcore.cosmossdk.types.mint.MintParams;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryParamsResponse {

    /**
     * params defines the parameters of the module.
     */
    @JsonProperty("params")
    public MintParams params;

}