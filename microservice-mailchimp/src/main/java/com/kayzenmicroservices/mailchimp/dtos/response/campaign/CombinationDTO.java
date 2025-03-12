package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 12/03/2025
 * Descripción:
 */

@Data
public class CombinationDTO {

    private String id;

    @JsonProperty("subject_line")
    private int subjectLine;

    @JsonProperty("send_time")
    private int sendTime;

    @JsonProperty("from_name")
    private int fromName;

    @JsonProperty("reply_to")
    private int replyTo;

    @JsonProperty("content_description")
    private int contentDescription;

    private int recipients;
}
