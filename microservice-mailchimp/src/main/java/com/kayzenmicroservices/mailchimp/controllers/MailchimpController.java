package com.kayzenmicroservices.mailchimp.controllers;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceMemberListCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.CampaignRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.services.MailChimpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 10/03/2025
 * Descripción: This is the complete use for api mailchimp consumer
 */

@RestController
@RequestMapping("/mailchimp")
public class MailchimpController {
    @Autowired
    MailChimpService mailchimpService;

    @PostMapping(name = "/createnadsend")
    public String sendEmailsCreatingAudienceAndCampaign(AudienceMembersDTO audienceList, AudienceMemberListCreationBodyDTO customerList, CampaignRequestDTO campaign){
        mailchimpService.sendEmailsCreatingAudienceAndCampaign(audienceList, customerList, campaign);
        return "created";

    }
}
