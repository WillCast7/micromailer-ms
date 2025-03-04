package com.kayzenmicroservices.mailchimp.dtos.response.audienceList;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: Constraints
 */

@Data
public class ConstraintsDTO {

    @JsonProperty("may_create")
    private boolean mayCreate;

    @JsonProperty("max_instances")
    private int maxInstances;

    @JsonProperty("current_total_instances")
    private int currentTotalInstances;
}
