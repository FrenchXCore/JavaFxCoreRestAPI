package eu.frenchxcore.cosmossdk.query.staking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.frenchxcore.cosmossdk.types.staking.HistoricalInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryHistoricalInfoResponse {

    /**
     * hist defines the historical info at the given height.
     */
    @JsonProperty("hist")
    public HistoricalInfo hist;

}