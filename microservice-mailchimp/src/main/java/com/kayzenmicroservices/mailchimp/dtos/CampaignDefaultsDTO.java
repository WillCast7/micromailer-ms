package com.kayzenmicroservices.mailchimp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: ...
 */

@Data
public class CampaignDefaultsDTO {

    @JsonProperty("from_name")
    private String fromName;

    @JsonProperty("from_email")
    private String fromEmail;

    private String subject;

    private String language;
}
