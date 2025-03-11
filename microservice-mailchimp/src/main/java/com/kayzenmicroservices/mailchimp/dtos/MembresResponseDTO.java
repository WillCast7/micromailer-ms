package com.kayzenmicroservices.mailchimp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import lombok.Data;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 4/03/2025
 * Descripción:
 */

@Data
public class MembresResponseDTO {

    @JsonProperty("members")
    private List<AudienceMembersDTO> members;

    @JsonProperty("list_id")
    private String listId;

    @JsonProperty("total_items")
    private int totalItems;

}
