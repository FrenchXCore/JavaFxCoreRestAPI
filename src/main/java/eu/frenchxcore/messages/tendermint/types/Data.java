package eu.frenchxcore.messages.tendermint.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    /**
     * 
     */
    @JsonProperty("txs")
    public List<String> txs;
    
}