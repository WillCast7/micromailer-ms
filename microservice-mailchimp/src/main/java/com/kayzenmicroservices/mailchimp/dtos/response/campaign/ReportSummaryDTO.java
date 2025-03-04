package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReportSummaryDTO {
    private Integer opens;

    @JsonProperty("unique_opens")
    private Integer uniqueOpens;

    @JsonProperty("open_rate")
    private Integer openRate;

    private Integer clicks;

    @JsonProperty("subscriber_clicks")
    private Integer subscriberClicks;

    @JsonProperty("click_rate")
    private Integer clickRate;

    private EcommerceDTO ecommerce;
}
