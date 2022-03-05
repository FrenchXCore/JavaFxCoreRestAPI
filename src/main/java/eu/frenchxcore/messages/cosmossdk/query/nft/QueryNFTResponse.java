package eu.frenchxcore.messages.cosmossdk.query.nft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.frenchxcore.messages.cosmossdk.types.nft.Nft;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryNFTResponse {

    @JsonProperty("nft")
    public Nft nft;

}
