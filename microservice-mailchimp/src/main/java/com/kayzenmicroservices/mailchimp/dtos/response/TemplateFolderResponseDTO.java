package com.kayzenmicroservices.mailchimp.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.response.foldersTemplate.FolderResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.memberAudience.LinkDTO;
import lombok.Data;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 11/03/2025
 * Descripción:
 */

@Data
public class TemplateFolderResponseDTO {

    private List<FolderResponseDTO> folders;

    @JsonProperty("total_items")
    private int totalItems;

    @JsonProperty("_links")
    private List<LinkDTO> links;
}
