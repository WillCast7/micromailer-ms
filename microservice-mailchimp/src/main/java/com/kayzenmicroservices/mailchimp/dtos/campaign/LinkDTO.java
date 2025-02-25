package com.kayzenmicroservices.mailchimp.dtos.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LinkDTO {
    private String rel;
    private String href;
    private String method;

    @JsonProperty("targetSchema")
    private String targetSchema;

    private String schema;
}
