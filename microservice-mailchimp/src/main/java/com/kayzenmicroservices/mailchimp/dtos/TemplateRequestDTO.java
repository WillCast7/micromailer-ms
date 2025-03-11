package com.kayzenmicroservices.mailchimp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 11/03/2025
 * Descripción:
 */

@Data
public class TemplateRequestDTO {

    private String name;

    private String html;

    @JsonProperty("folder_id")
    private String folderId;

}
