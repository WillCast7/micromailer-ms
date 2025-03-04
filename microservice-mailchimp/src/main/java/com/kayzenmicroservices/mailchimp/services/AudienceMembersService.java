package com.kayzenmicroservices.mailchimp.services;

import com.kayzenmicroservices.mailchimp.dtos.AudienceDTO;
import com.kayzenmicroservices.mailchimp.dtos.MembresResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.audienceList.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;

import java.util.List;

public interface AudienceMembersService {
    public MembresResponseDTO getAudienceMemberList(int row, int page, String id);
    public AudienceMembersDTO getMember(String audienceId, String memberId);
    public CampaignDTO createAudience(String id, List<AudienceDTO> customerList);
    public CampaignDTO updateAudience(String id);
}
