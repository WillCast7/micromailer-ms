package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LinkDTO {

    private String rel;

    private String href;

    private String method;

    private String targetSchema;

    private String schema;
}
