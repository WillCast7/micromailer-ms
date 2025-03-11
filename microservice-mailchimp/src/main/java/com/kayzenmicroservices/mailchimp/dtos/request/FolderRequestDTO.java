package com.kayzenmicroservices.mailchimp.dtos.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.response.memberAudience.LinkDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 11/03/2025
 * Descripción:
 */

@Data
@NoArgsConstructor
public class FolderRequestDTO {
    private String name;
}
