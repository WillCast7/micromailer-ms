package com.kayzenmicroservices.mailchimp.dtos.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EcommerceDTO {
    @JsonProperty("total_orders")
    private Integer totalOrders;

    @JsonProperty("total_spent")
    private Integer totalSpent;

    @JsonProperty("total_revenue")
    private Integer totalRevenue;
}
