package com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

/**
 * Autor: William Castaño ;)
 * Fecha: 3/03/2025
 * Descripción: rss
 */


public class RssOptsDTO {

    private ScheduleSendDTO schedule;

    private boolean constrain_rss_img;

    @NotBlank(message = "URL del feed RSS")
    @JsonProperty("feed_url")
    private String feedUrl;

    @NotBlank(message = "La frecuencia de la Campaña RSS. Valores posibles: daily, weekly, monthly.")
    private String frequency;
}
