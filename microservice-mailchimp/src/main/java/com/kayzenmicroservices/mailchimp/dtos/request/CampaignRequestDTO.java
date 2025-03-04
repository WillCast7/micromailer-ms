package com.kayzenmicroservices.mailchimp.dtos.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation.*;
import jakarta.validation.constraints.NotBlank;

/**
 * Autor: William Castaño ;)
 * Fecha: 3/03/2025
 * Descripción: this is the campaign Request DTO
 */

public class CampaignRequestDTO {

    @NotBlank(message = "Valores posibles: regular, plaintext, absplit, rss, variate")
    private String type;

    @JsonProperty("rss_opts")
    private RssOptsDTO rssOpts;

    private RecipientsDTO recipients;

    @JsonProperty("variate_settings")
    private VariateSettingsDTO variateSettings;

    private SettingsDTO settings;

    private TrackingDTO tracking;

    @JsonProperty("social_card")
    private SocialCardDTO socialCard;

    @JsonProperty("content_type")
    private String contentType;
}
