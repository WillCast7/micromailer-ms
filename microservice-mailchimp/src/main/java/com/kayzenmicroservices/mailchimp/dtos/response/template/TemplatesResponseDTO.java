package com.kayzenmicroservices.mailchimp.dtos.response.template;

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
public class TemplatesResponseDTO {

    private int id;

    private String type;

    private String name;

    @JsonProperty("drag_and_drop")
    private boolean dragAndDrop;

    private boolean responsive;

    private String category;

    @JsonProperty("date_created")
    private String dateCreated;

    @JsonProperty("date_edited")
    private String dateEdited;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("edited_by")
    private String editedBy;

    private boolean active;

    private String thumbnail;

    @JsonProperty("share_url")
    private String shareUrl;

    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("_links")
    private List<LinkDTO> links;
}
