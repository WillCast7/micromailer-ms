 package com.kayzenmicroservices.mailchimp.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import com.kayzenmicroservices.mailchimp.dtos.MembresResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceMemberListCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.AudienceMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.*;
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
     * @param clients is the customer's list for be transformed
     * @return response
     */
    public List<String> createMemberListInAudience(String listId, AudienceMemberListCreationBodyDTO clients) {
        List<String> results = new ArrayList<>();
        List<AudienceDTO>customerList = clients.getCustomerList();
        for (AudienceDTO cliente : customerList) {
            try {
                // Crear el cuerpo para un solo miembro
                Map<String, Object> memberData = new HashMap<>();
                memberData.put("email_address", cliente.getEmail());
                memberData.put("status", "subscribed");

                Map<String, Object> mergeFields = new HashMap<>();
                mergeFields.put("FNAME", cliente.getContactName());
                mergeFields.put("PHONE", cliente.getPhoneNumber());
                mergeFields.put("COMPANY", cliente.getName());
                memberData.put("merge_fields", mergeFields);

                Map<String, Object> location = new HashMap<>();
                location.put("city", cliente.getCity());
                memberData.put("location", location);

                System.out.println("memberData");
                System.out.println(memberData);

                // Enviar solicitud individual
                String response = webClientService.webClient.post()
                        .uri("/lists/" + listId + "/members")
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(memberData)
                        .retrieve()
                        .bodyToMono(String.class)
                        .block();

                results.add("Éxito para " + cliente.getEmail() + ": " + response);
            }catch (WebClientResponseException e) {
                String errorBody = e.getResponseBodyAsString();
                System.err.println("Error detallado: " + errorBody);}
            }

        return results;
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
