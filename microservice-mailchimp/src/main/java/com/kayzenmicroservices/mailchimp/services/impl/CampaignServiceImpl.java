package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.CampaignsResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: campaign services
 */

@Service
public class CampaignServiceImpl implements CampaignService {
    @Autowired
    WebClientServiceImpl webClientService;


    public CampaignsResponseDTO getCampaigns(int row, int page) {
        return webClientService.webClient.get()
                .uri("campaigns?count=" + row + "&offset=" + page)
                .retrieve()
                .bodyToMono(CampaignsResponseDTO.class)
                .block();
    }
    public CampaignDTO getCampaign(String id) {
        return webClientService.webClient.get()
                .uri("campaigns/" + id)
                .retrieve()
                .bodyToMono(CampaignDTO.class)
                .block();
    }

    public Mono<CampaignsResponseDTO> getCampaignsmono() {
        return webClientService.webClient.get()
                .uri("/campaigns")
                .retrieve()
                .bodyToMono(CampaignsResponseDTO.class);
    }
}
