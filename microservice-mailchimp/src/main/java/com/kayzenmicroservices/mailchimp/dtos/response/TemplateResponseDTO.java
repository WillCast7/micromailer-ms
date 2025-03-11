package com.kayzenmicroservices.mailchimp.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.response.memberAudience.LinkDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.template.TemplatesResponseDTO;
import lombok.Data;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 11/03/2025
 * Descripción:
 */

@Data
public class TemplateResponseDTO {

    private List<TemplatesResponseDTO> templates;

    @JsonProperty("total_items")
    private int totalItems;

    @JsonProperty("_links")
    private List<LinkDTO> links;

}
