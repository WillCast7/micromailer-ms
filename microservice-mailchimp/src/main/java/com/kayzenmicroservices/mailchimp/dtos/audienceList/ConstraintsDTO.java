package com.kayzenmicroservices.mailchimp.dtos.audienceList;

import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: Constraints
 */

@Data
public class ConstraintsDTO {
    private boolean may_create;
    private int max_instances;
    private int current_total_instances;
}
