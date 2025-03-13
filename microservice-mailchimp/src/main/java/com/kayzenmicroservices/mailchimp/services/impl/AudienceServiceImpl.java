package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.request.AudienceCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceCreationResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.AudienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClientResponseException;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: audience all services
 */
@Service
public class AudienceServiceImpl implements AudienceService {

    @Autowired
    WebClientServiceImpl webClientService;

    public AudienceMembersDTO getAudienceList(int row, int page) {

        return webClientService.webClient.get()
                .uri("lists?count=" + row + "&offset=" + page)
                .retrieve()
                .bodyToMono(AudienceMembersDTO.class)
                .block();
    }

    public AudienceMembersDTO getAudience(String id) {
        return webClientService.webClient.get()
                .uri("lists/" + id)
                .retrieve()
                .bodyToMono(AudienceMembersDTO.class)
                .block();
    }

    public AudienceCreationResponseDTO createAudience(AudienceCreationBodyDTO body) {
        System.out.println("Crear audiencia");
        AudienceCreationResponseDTO audicence = new AudienceCreationResponseDTO();

        System.out.println("body");
        System.out.println(body);
        try {
            audicence = webClientService.webClient.post()
                    .uri("lists")
                    .body(BodyInserters.fromValue(body))
                    .retrieve()
                    .bodyToMono(AudienceCreationResponseDTO.class)
                    .block();
        } catch (WebClientResponseException e) {
            String errorBody = e.getResponseBodyAsString();
            System.err.println("Error detallado: " + errorBody);
        }
        System.out.println("audiencia creada");
        return audicence;
    }

    public CampaignDTO updateAudience(String id) {
        return webClientService.webClient.get()
                .uri("lists" + id)
                .retrieve()
                .bodyToMono(CampaignDTO.class)
                .block();
    }

}
