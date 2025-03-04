package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Autor: William Castaño ;)
 * Fecha: 3/03/2025
 * Descripción: Au services implementation
 */


public class ListServiceImpl {
    @Autowired
    WebClientServiceImpl webClientService;

    public AudienceDTO getAudiences(int row, int page) {
        return webClientService.webClient.get()
                .uri("lists?count=" + row + "&offset=" + page)
                .retrieve()
                .bodyToMono(AudienceDTO.class)
                .block();
    }

    public AudienceDTO getAudience(String id) {
        return webClientService.webClient.get()
                .uri("lists/" + id)
                .retrieve()
                .bodyToMono(AudienceDTO.class)
                .block();
    }


}
