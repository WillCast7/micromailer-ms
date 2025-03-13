package com.kayzenmicroservices.mailchimp.services;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceMemberListCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.CampaignRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceCreationResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 10/03/2025
 * Descripción: Logic for complete mailchimp service
 */

public interface MailChimpService {
    public String sendEmailsCreatingAudienceAndCampaign(AudienceCreationBodyDTO audience, AudienceMemberListCreationBodyDTO customerList, CampaignRequestDTO campaign);
}
