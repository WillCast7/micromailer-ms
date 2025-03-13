package com.kayzenmicroservices.mailchimp.dtos.request;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 10/03/2025
 * Descripción:
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AudienceMemberListCreationBodyDTO {
    private List<AudienceDTO> customerList;
}
