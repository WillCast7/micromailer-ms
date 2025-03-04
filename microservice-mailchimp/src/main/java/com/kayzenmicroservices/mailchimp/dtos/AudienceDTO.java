package com.kayzenmicroservices.mailchimp.dtos;

import lombok.*;

/**
 * Autor: William Castaño ;)
 * Fecha: 3/03/2025
 * Descripción: this is the Audience DTO / In kayzen aplication is same CustomerTableDTO
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class AudienceDTO {
    private String id;
    private String name;
    private String nit;
    private String contactName;
    private String city;
    private String email;
    private String phoneNumber;
    private String groupName;
}
