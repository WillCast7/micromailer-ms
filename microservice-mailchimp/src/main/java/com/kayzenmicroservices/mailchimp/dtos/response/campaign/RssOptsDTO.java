package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.kayzenmicroservices.mailchimp.dtos.response.campaign.ScheduleDTO;
import lombok.Data;

import java.time.Instant;

/**
 * Autor: William Castaño ;)
 * Fecha: 12/03/2025
 * Descripción:
 */

@Data
public class RssOptsDTO {
    private String feedUrl;
    private String frequency;
    private ScheduleDTO schedule;
    private Instant lastSent;
    private boolean constrainRssImg;
}
