package com.kayzenmicroservices.mailchimp.dtos.response.memberAudience;

import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 10/03/2025
 * Descripción:
 */

@Data
public class LinkDTO {
    private String rel;
    private String href;
    private String method;
    private String targetSchema;
    private String schema;

}
