package eu.frenchxcore.cosmossdk.types.distribution;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.frenchxcore.cosmossdk.types._base.ValidatorAccumulatedCommission;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryValidatorCommissionResponse {

    /**
     * commission defines the commision the validator received.
     */
    @JsonProperty("commission")
    public ValidatorAccumulatedCommission commission;
    
}