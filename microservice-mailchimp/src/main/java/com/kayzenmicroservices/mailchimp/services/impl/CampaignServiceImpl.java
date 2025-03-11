package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.request.CampaignRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.CampaignsResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
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

    public CampaignsResponseDTO createCampaign(CampaignRequestDTO body) {
        System.out.println("entro al servicio");
        return webClientService.webClient.post()
                .uri("/campaigns")
                .body(BodyInserters.fromValue(body))
                .retrieve()
                .bodyToMono(CampaignsResponseDTO.class)
                .block();
    }
}
