package eu.frenchxcore.messages.cosmossdk.query.staking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import eu.frenchxcore.messages.cosmossdk.types.staking.UnbondingDelegation;
import eu.frenchxcore.messages.cosmossdk.types.query.PageResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryValidatorUnbondingDelegationsResponse {

    /**
     * 
     */
    @JsonProperty("unbonding_responses")
    public List<UnbondingDelegation> unbondingResponses;
    
    /**
     * pagination defines the pagination in the response.
     */
    @JsonProperty("pagination")
    public PageResponse pagination;
    
}
