package com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Autor: William Castaño ;)
 * Fecha: 3/03/2025
 * Descripción: schedule send
 */


public class ScheduleSendDTO {
    private int hour;

    @JsonProperty("daily_send")
    private DailySendDTO dailySend;

    @JsonProperty("weekly_send_day")
    private String weeklySendDay;

    @JsonProperty("monthly_send_date")
    private int monthlySendDate;
}
