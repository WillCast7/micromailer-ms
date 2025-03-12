package com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Autor: William Castaño ;)
 * Fecha: 4/03/2025
 * Descripción:
 */


public class TrackingDTO {

    private boolean opens;

    @JsonProperty("html_clicks")
    private boolean htmlClicks;

    @JsonProperty("text_clicks")
    private boolean textClicks;

    private boolean ecomm360;

//    @JsonProperty("google_analytics")
//    private String googleAnalytics;

    private String clicktale;

}
