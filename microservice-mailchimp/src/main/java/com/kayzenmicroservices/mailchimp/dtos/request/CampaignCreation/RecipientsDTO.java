package com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 4/03/2025
 * Descripción:
 */

@Data
public class RecipientsDTO {
//    @JsonProperty("segment_opts")
//    private SegmentOptsDTO segmentOpts;

    @NotBlank(message = "Numero id de list o audiencia")
    @JsonProperty("list_id")
    private String listId;
}
