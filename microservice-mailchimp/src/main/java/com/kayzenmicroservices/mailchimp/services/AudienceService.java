package com.kayzenmicroservices.mailchimp.services;

import com.kayzenmicroservices.mailchimp.dtos.request.AudienceCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceCreationResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;

public interface AudienceService {
    public AudienceMembersDTO getAudienceList(int row, int page);
    public AudienceMembersDTO getAudience(String id);
    public AudienceCreationResponseDTO createAudience(AudienceCreationBodyDTO body);
    public CampaignDTO updateAudience(String id);
}
