package com.kayzenmicroservices.mailchimp.dtos;

import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: contact DTO  of audience
 */

@Data
public class ContactDTO {
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
}
