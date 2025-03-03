package com.kayzenmicroservices.mailchimp.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 27/02/2025
 * Descripción: this is the DTO for the request batch request
 */
@Getter
@Setter
public class BatchRequestDTO {
    private List<OperationDTO> operations;
}

