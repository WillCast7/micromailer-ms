package com.kayzenmicroservices.mailchimp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.dtos.campaign.LinkDTO;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: response dto of mailchimp
 */

public class CampaignsResponseDTO {
    @JsonProperty("campaigns")
    private List<CampaignDTO> campaigns;

    @JsonProperty("total_items")
    private Integer totalItems;

    @JsonProperty("_links")
    private List<LinkDTO> links;
}
