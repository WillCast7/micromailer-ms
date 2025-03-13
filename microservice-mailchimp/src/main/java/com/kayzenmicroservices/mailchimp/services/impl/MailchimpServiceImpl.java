package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceMemberListCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.CampaignRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceCreationResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.CampaignCreationResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation.RecipientsDTO;
import com.kayzenmicroservices.mailchimp.services.AudienceMembersService;
import com.kayzenmicroservices.mailchimp.services.AudienceService;
import com.kayzenmicroservices.mailchimp.services.CampaignService;
import com.kayzenmicroservices.mailchimp.services.MailChimpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 10/03/2025
 * Descripción: Logic for complete mailchimp service
 */

@Service
public class MailchimpServiceImpl implements MailChimpService {

    @Autowired
    AudienceService audienceService;

    @Autowired
    AudienceMembersService audienceMembersService;

    @Autowired
    CampaignService campaignService;

    public String sendEmailsCreatingAudienceAndCampaign(AudienceCreationBodyDTO audience, AudienceMemberListCreationBodyDTO customerList, CampaignRequestDTO campaign){
        AudienceCreationResponseDTO audienceResponse = new AudienceCreationResponseDTO();
        List<String> campaignResponse = new ArrayList<String>();
        CampaignCreationResponseDTO createCampaign = new CampaignCreationResponseDTO();
        try {
            System.out.println("Entra al try catch");

            audienceResponse = audienceService.createAudience(audience);
            System.out.println("audienceResponse");
            System.out.println(audienceResponse);

            campaignResponse = audienceMembersService.createMemberListInAudience(audienceResponse.getId(), customerList);
            System.out.println("campaignResponse");
            System.out.println(campaignResponse);

            RecipientsDTO recipient = new RecipientsDTO();
            recipient.setListId(audienceResponse.getId());
            campaign.setRecipients(recipient);

            createCampaign = campaignService.createCampaign(campaign);
            System.out.println("createCampaign");
            System.out.println(createCampaign);

        } catch (Exception e) {
            System.out.println("Error en el proceso: " + e);
            throw new RuntimeException(e);
        }

        return "done";
    }
}