package com.kayzenmicroservices.mailchimp.dtos.response.memberAudience;

import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 10/03/2025
 * Descripción:
 */

@Data
public class LocationDTO {
    private double latitude;
    private double longitude;
    private int gmtoff;
    private int dstoff;
    private String countryCode;
    private String timezone;
    private String region;
}
