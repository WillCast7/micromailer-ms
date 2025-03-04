package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ConditionDTO {
    @JsonProperty("condition_type")
    private String conditionType;

    private String field;
    private String op;
    private String value;
}
