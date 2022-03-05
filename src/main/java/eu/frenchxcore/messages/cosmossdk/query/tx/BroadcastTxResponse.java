package eu.frenchxcore.messages.cosmossdk.query.tx;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.frenchxcore.messages.cosmossdk.types.tx.TxResponse;

/**
 * BroadcastTxResponse is the response type for the Service.BroadcastTx method.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BroadcastTxResponse {

    /**
     * txResponse is the queried TxResponses.
     */
    @JsonProperty("tx_response")
    public TxResponse txResponse;
    
}