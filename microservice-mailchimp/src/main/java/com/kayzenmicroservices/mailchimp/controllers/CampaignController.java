package com.kayzenmicroservices.mailchimp.controllers;

import com.kayzenmicroservices.mailchimp.dtos.request.CampaignRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.CampaignCreationResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.CampaignsResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.CampaignService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: campaing controller
 */

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    @Autowired
    CampaignService campaignService;

    @GetMapping
    public CampaignsResponseDTO getAllCampaings(@RequestParam(defaultValue = "10") int row,
                                                @RequestParam(defaultValue = "0") int page){
        return campaignService.getCampaigns(row, page);
    }

    @GetMapping(value = "/{id}" ,produces = "application/json")
    public CampaignDTO getCampaing(@PathVariable String id){
        return campaignService.getCampaign(id);
    }

    @PostMapping(produces = "application/json")
    public CampaignCreationResponseDTO createCampaign(@Valid @RequestBody CampaignRequestDTO body){
        return campaignService.createCampaign(body);
    }

}
