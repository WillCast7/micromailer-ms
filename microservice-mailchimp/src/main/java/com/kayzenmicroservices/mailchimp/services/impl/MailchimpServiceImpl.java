package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceMemberListCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.AudienceMembersService;
import com.kayzenmicroservices.mailchimp.services.AudienceService;
import com.kayzenmicroservices.mailchimp.services.MailChimpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public String sendEmailsCreatingAudienceAndCampaign(AudienceMembersDTO audienceList, AudienceMemberListCreationBodyDTO customerList){
        AudienceMembersDTO audienceResponse = audienceService.createAudience(audienceList);
        List<String> campaignResponse = audienceMembersService.createMemberListInAudience(audienceResponse.getId(), customerList);

        return "done";
    }
}