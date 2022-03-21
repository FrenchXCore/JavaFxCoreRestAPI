package eu.frenchxcore.messages.cosmossdk.types.bank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.frenchxcore.messages.cosmossdk.types.base.v1beta1.Coin;

import java.util.List;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Output {

    /**
     * 
     */
    @JsonProperty("address")
    public String address;
    
    /**
     * 
     */
    @JsonProperty("coins")
    public List<Coin> coins;

}