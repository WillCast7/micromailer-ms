package com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Autor: William Castaño ;)
 * Fecha: 4/03/2025
 * Descripción:
 */


public class SocialCardDTO {
    @JsonProperty("image_url")
    private String imageUrl;

    private String description;

    private String title;
}
