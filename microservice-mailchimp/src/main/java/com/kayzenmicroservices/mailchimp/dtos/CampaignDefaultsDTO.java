package com.kayzenmicroservices.mailchimp.dtos;

import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: ...
 */

@Data
public class CampaignDefaultsDTO {
    private String from_name;
    private String from_email;
    private String subject;
    private String language;
}
