package com.kayzenmicroservices.mailchimp.dtos.response.audienceList;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: stats dto from audecince
 */

@Data
public class StatsDTO {

    @JsonProperty("member_count")
    private Integer memberCount;

    @JsonProperty("unsubscribe_count")
    private Integer unsubscribeCount;

    @JsonProperty("cleaned_count")
    private Integer cleanedCount;

    @JsonProperty("member_count_since_send")
    private Integer memberCountSinceSend;

    @JsonProperty("unsubscribe_count_since_send")
    private Integer unsubscribeCountSinceSend;

    @JsonProperty("cleaned_count_since_send")
    private Integer cleanedCountSinceSend;

    @JsonProperty("campaign_count")
    private Integer campaignCount;

    @JsonProperty("campaignlastsent")
    private String campaignLastSent;

    @JsonProperty("merge_field_count")
    private Integer mergeFieldCount;

    @JsonProperty("avg_sub_rate")
    private Integer avgSubRate;

    @JsonProperty("avg_unsub_rate")
    private Integer avgUnsubRate;

    @JsonProperty("target_sub_rate")
    private Integer targetSubRate;

    @JsonProperty("open_rate")
    private Integer openRate;

    @JsonProperty("click_rate")
    private Integer clickRate;

    @JsonProperty("last_sub_date")
    private LocalDateTime lastSubDate;

    @JsonProperty("last_unsub_date")
    private String lastUnsubDate;
}
