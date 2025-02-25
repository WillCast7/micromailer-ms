package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.AudienceResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.CampaignsResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.audienceList.AudienceListDTO;
import com.kayzenmicroservices.mailchimp.dtos.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.AudienceService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: audience all services
 */

public class AudienceServiceImpl implements AudienceService {

    @Autowired
    WebClientServiceImpl webClientService;

    public AudienceResponseDTO getAudienceList(int row, int page) {
        return webClientService.webClient.get()
                .uri("lists?count=" + row + "&offset=" + page)
                .retrieve()
                .bodyToMono(AudienceResponseDTO.class)
                .block();
    }

    public AudienceListDTO getAudience(String id) {
        return webClientService.webClient.get()
                .uri("lists/" + id)
                .retrieve()
                .bodyToMono(AudienceListDTO.class)
                .block();
    }


    //TODO Faltan estos
    public CampaignDTO createAudience(String id) {
        return webClientService.webClient.get()
                .uri("lists/" + id)
                .retrieve()
                .bodyToMono(CampaignDTO.class)
                .block();
    }

    public CampaignDTO updateAudience(String id) {
        return webClientService.webClient.get()
                .uri("campaigns/" + id)
                .retrieve()
                .bodyToMono(CampaignDTO.class)
                .block();
    }

}
