package eu.frenchxcore.messages.cosmossdk.query.base.tendermint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetSyncingResponse {

    /**
     * 
     */
    @JsonProperty("syncing")
    public Boolean syncing;
    
}
