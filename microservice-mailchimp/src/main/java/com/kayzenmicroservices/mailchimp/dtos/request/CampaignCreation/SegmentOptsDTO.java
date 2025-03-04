package com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;

/**
 * Autor: William Castaño ;)
 * Fecha: 4/03/2025
 * Descripción:
 */


public class SegmentOptsDTO {

    @JsonProperty("saved_segment_id")
    private int savedSegmentId;

    private String match;

    private Array conditions;

}
