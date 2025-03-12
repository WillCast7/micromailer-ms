package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;

/**
 * Autor: William Castaño ;)
 * Fecha: 12/03/2025
 * Descripción:
 */

@Data
public class AbSplitOptsDTO {

    @JsonProperty("")
    private String splitTest;

    @JsonProperty("")
    private String pickWinner;

    @JsonProperty("")
    private String waitUnits;

    @JsonProperty("")
    private int waitTime;

    @JsonProperty("")
    private int splitSize;

    private String fromNameA;

    private String fromNameB;

    @JsonProperty("")
    private String replyEmailA;

    @JsonProperty("")
    private String replyEmailB;

    private String subjectA;

    private String subjectB;

    @JsonProperty("")
    private Instant sendTimeA;

    @JsonProperty("")
    private Instant sendTimeB;

    @JsonProperty("")
    private String sendTimeWinner;
}
