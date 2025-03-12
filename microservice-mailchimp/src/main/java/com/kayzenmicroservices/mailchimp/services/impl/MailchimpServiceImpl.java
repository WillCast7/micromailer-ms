package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceMemberListCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.CampaignRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.CampaignCreationResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.RecipientsDTO;
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

    public String sendEmailsCreatingAudienceAndCampaign(AudienceMembersDTO audience, AudienceMemberListCreationBodyDTO customerList, CampaignRequestDTO campaign){
        AudienceMembersDTO audienceResponse = new AudienceMembersDTO();
        List<String> campaignResponse = new ArrayList<String>();
        CampaignCreationResponseDTO createCampaign = new CampaignCreationResponseDTO();

        audienceResponse = audienceService.createAudience(audience);
        campaignResponse = audienceMembersService.createMemberListInAudience(audienceResponse.getId(), customerList);

            RecipientsDTO recipient = new RecipientsDTO();
            recipient.setListId(audienceResponse.getId());
            createCampaign.setRecipients(recipient);

        createCampaign = campaignService.createCampaign(campaign);
        return "done";
    }
}