package com.kayzenmicroservices.mailchimp.dtos.request;

import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 13/03/2025
 * Descripción:
 */

@Data
public class MailchimpCompleteCreationDTO {
        private AudienceCreationBodyDTO audience;
        private AudienceMemberListCreationBodyDTO customerList;
        private CampaignRequestDTO campaign;

}
