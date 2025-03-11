package com.kayzenmicroservices.mailchimp.dtos.request;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import lombok.Data;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 10/03/2025
 * Descripción:
 */

@Data
public class AudienceMemberListCreationBodyDTO {
    private List<AudienceDTO> customerList;
}
