package com.kayzenmicroservices.mailchimp.dtos.audienceList;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: stats dto from audecince
 */

@Data
public class StatsDTO {
    private Integer memberCount;
    private Integer unsubscribeCount;
    private Integer cleanedCount;
    private Integer memberCountSinceSend;
    private Integer unsubscribeCountSinceSend;
    private Integer cleanedCountSinceSend;
    private Integer campaignCount;
    private String campaignLastSent;
    private Integer mergeFieldCount;
    private Integer avgSubRate;
    private Integer avgUnsubRate;
    private Integer targetSubRate;
    private Integer openRate;
    private Integer clickRate;
    private LocalDateTime lastSubDate;
    private String lastUnsubDate;
}
