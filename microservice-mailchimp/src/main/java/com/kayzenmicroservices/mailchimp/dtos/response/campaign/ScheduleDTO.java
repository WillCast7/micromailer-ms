package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation.DailySendDTO;
import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 12/03/2025
 * Descripción:
 */

@Data
public class ScheduleDTO {
    private int hour;
    private DailySendDTO dailySend;
    private String weeklySendDay;
    private int monthlySendDate;
}
