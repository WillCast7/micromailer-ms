package com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 4/03/2025
 * Descripción:
 */


public class VariateSettingsDTO {
    @JsonProperty("wait_time")
    private int waitTime;

    @JsonProperty("test_size")
    private int testSize;

    @JsonProperty("subject_lines")
    private List<String> subjectLines;

    @JsonProperty("send_times")
    private List<String> sendTimes;

    @JsonProperty("from_names")
    private List<String> fromNames;

    @JsonProperty("reply_to_addresses")
    private List<String> replyToAddresses;

    @NotBlank(message = "valores posibles: The combination that performs the best. This may be determined automatically by click rate, open rate, or total revenue -- or you may choose manually based on the reporting data you find the most valuable. For Multivariate Campaigns testing send_time, winner_criteria is ignored. For Multivariate Campaigns with 'manual' as the winner_criteria, the winner must be chosen in the Mailchimp web application. Possible values: opens, clicks, manual, total_revenue.")
    @JsonProperty("winner_criteria")
    private String winnerCriteria;
}
