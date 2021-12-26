package eu.frenchxcore.cosmossdk.query.bank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.frenchxcore.cosmossdk.types.Coin;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryBalanceResponse {

    /**
     * balance is the balance of the coin.
     */
    @JsonProperty("balance")
    public Coin balance;

}