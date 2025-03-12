package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 12/03/2025
 * Descripción:
 */

@Data
public class VariateSettingsDTO {

    @JsonProperty("winning_combination_id")
    private String winningCombinationId;

    @JsonProperty("winning_campaign_id")
    private String winningCampaignId;

    @JsonProperty("winner_criteria")
    private String winnerCriteria;

    @JsonProperty("wait_time")
    private int waitTime;

    @JsonProperty("test_size")
    private int testSize;

    @JsonProperty("subject_lines")
    private List<String> subjectLines;

    @JsonProperty("send_times")
    private List<Instant> sendTimes;

    @JsonProperty("from_names")
    private List<String> fromNames;

    @JsonProperty("reply_to_addresses")
    private List<String> replyToAddresses;

    private List<String> contents;

    private List<CombinationDTO> combinations;
}
