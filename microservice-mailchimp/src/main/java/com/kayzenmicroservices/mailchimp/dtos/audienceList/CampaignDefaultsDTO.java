package com.kayzenmicroservices.mailchimp.dtos.audienceList;

import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: ...
 */

@Data
public class CampaignDefaultsDTO {
    private String fromName;
    private String fromEmail;
    private String subject;
    private String language;
}
