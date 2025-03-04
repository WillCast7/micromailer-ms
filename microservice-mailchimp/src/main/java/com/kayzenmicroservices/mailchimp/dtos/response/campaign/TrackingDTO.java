package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrackingDTO {
    private Boolean opens;

    @JsonProperty("html_clicks")
    private Boolean htmlClicks;

    @JsonProperty("text_clicks")
    private Boolean textClicks;

    @JsonProperty("goal_tracking")
    private Boolean goalTracking;

    private Boolean ecomm360;

    @JsonProperty("google_analytics")
    private String googleAnalytics;

    private String clicktale;
}
