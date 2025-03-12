package com.kayzenmicroservices.mailchimp.dtos.response.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DeliveryStatusDTO {

    private Boolean enabled;

    private boolean canCancel;

    private String status;

    @JsonProperty("email_sent")
    private int emailsSent;

    @JsonProperty("emails_canceled")
    private int emailsCanceled;
}
