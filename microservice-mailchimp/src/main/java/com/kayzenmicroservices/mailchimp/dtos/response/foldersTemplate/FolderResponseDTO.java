package com.kayzenmicroservices.mailchimp.dtos.response.foldersTemplate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.response.memberAudience.LinkDTO;
import lombok.Data;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 11/03/2025
 * Descripción:
 */

@Data
public class FolderResponseDTO {

    private String name;

    private String id;

    private int count;

    @JsonProperty("_links")
    private List<LinkDTO> links;

}
