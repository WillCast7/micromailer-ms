package com.kayzenmicroservices.mailchimp.dtos.audienceList;

import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: principal DTO of audience-list
 */

@Data
public class AudienceListDTO {
    private String id;
    private Integer webId;
    private String name;
    private ContactDTO contact;
    private String permissionReminder;
    private Boolean useArchiveBar;
    private CampaignDefaultsDTO campaignDefaults;
    private StatsDTO stats;
}
