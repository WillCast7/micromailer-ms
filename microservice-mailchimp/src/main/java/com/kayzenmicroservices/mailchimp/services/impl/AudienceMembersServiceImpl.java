 package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import com.kayzenmicroservices.mailchimp.dtos.MembresResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.OperationDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.audienceList.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.AudienceMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

 /**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: members audience all services
 */
@Service
public class AudienceMembersServiceImpl implements AudienceMembersService {

    @Autowired
    WebClientServiceImpl webClientService;

     /**
      *
      * @param row
      * @param page
      * @param id
      * @return
      */
    public MembresResponseDTO getAudienceMemberList(int row, int page, String id) {
        return webClientService.webClient.get()
                .uri("lists/" + id + "/members?count=" + row + "&offset=" + page)
                .retrieve()
                .bodyToMono(MembresResponseDTO.class)
                .block();
    }

     /**
      *
      * @param audienceId
      * @param memberId
      * @return
      */
    public AudienceMembersDTO getMember(String audienceId, String memberId) {
        return webClientService.webClient.get()
                .uri("lists/" + audienceId + "/members/" + memberId)
                .retrieve()
                .bodyToMono(AudienceMembersDTO.class)
                .block();
    }

    /**
     *
     * This method is for save many data
     * @param id is the id of the list or audience
     * @param customerList is the customer's list for be transformed
     * @return response
     */
    public CampaignDTO createAudience(String id, List<AudienceDTO> customerList) {

        List<OperationDTO> body = customerList.stream()
                .map(cliente -> new OperationDTO(
                        "POST",
                        "/lists/{list_id}/members",
                        String.format("{\"email_address\":\"%s\",\"status\":\"subscribed\"}", cliente.getEmail())
                ))
                .collect(Collectors.toList());

        return webClientService.webClient.post()
                .uri("batches")
                .bodyValue(body)
                .retrieve()
                .bodyToMono(CampaignDTO.class)
                .block();
    }

     /**
      *
      * @param id
      * @return
      */
    public CampaignDTO updateAudience(String id) {
        return webClientService.webClient.get()
                .uri("campaigns/" + id)
                .retrieve()
                .bodyToMono(CampaignDTO.class)
                .block();
    }

}
