package com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

/**
 * Autor: William Castaño ;)
 * Fecha: 4/03/2025
 * Descripción:
 */


public class RecipientsDTO {
    private SegmentOptsDTO segment_opts;

    @NotBlank(message = "Numero id de list o audiencia")
    @JsonProperty("list_id")
    private String listId;
}
