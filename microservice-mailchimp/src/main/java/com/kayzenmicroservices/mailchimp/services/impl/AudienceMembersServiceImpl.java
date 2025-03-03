 package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.AudienceResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.BatchRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.OperationDTO;
import com.kayzenmicroservices.mailchimp.dtos.audienceList.AudienceListDTO;
import com.kayzenmicroservices.mailchimp.dtos.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.AudienceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

 /**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: members audience all services
 */

public class AudienceMembersServiceImpl implements AudienceService {

    @Autowired
    WebClientServiceImpl webClientService;

    public AudienceResponseDTO getAudienceMemberList(int row, int page, String id) {
        return webClientService.webClient.get()
                .uri("lists/" + id + "/members?count=" + row + "&offset=" + page)
                .retrieve()
                .bodyToMono(AudienceResponseDTO.class)
                .block();
    }

    public AudienceListDTO getMember(String audienceId, String memberId) {
        return webClientService.webClient.get()
                .uri("lists/" + audienceId + "/members/" + memberId)
                .retrieve()
                .bodyToMono(AudienceListDTO.class)
                .block();
    }

    /**
     *
     * This method is for save many data
     * @param id is the id of the list or audience
     * @param requestBody is the body for be transformed
     * @return response
     */
    public CampaignDTO createAudience(String id, String requestBody) {
        BatchRequestDTO body = new BatchRequestDTO();
        body.setOperations(List.of(
                new OperationDTO("POST", "/lists/{list_id}/members", "{\"email_address\":\"cliente1@example.com\",\"status\":\"subscribed\"}"),
                new OperationDTO("POST", "/lists/{list_id}/members", "{\"email_address\":\"cliente2@example.com\",\"status\":\"subscribed\"}")
        ));

        return webClientService.webClient.post()
                .uri("batches")
                .bodyValue(body)
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
