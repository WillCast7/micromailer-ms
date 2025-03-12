package com.kayzenmicroservices.mailchimp.services;

import com.kayzenmicroservices.mailchimp.dtos.request.CampaignRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.CampaignCreationResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.CampaignsResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface CampaignService {
    public CampaignsResponseDTO getCampaigns(int row, int page);
    public CampaignDTO getCampaign(String id);
    public CampaignCreationResponseDTO createCampaign(CampaignRequestDTO body);
}
