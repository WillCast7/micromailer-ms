package com.kayzenmicroservices.mailchimp.services;

import com.kayzenmicroservices.mailchimp.dtos.MembresResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceMemberListCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;

import java.util.List;

public interface AudienceMembersService {
    public MembresResponseDTO getAudienceMemberList(int row, int page, String id);
    public AudienceMembersDTO getMember(String audienceId, String memberId);
    public List<String> createMemberListInAudience(String id, AudienceMemberListCreationBodyDTO customerList);
    public CampaignDTO updateAudience(String id);
}
