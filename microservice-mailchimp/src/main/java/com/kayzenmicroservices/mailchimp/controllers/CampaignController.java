package com.kayzenmicroservices.mailchimp.controllers;

import com.kayzenmicroservices.mailchimp.dtos.CampaignsResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.campaign.CampaignDTO;
import com.kayzenmicroservices.mailchimp.services.impl.CampaignServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: campaing controller
 */

@RestController
@RequestMapping("/campaings")
public class CampaignController {
    @Autowired
    CampaignServiceImpl campaignService;

    @GetMapping("mono")
    public Mono<CampaignsResponseDTO> getAllCampaingsmono(){
        return campaignService.getCampaignsmono();
    }

    @GetMapping
    public CampaignsResponseDTO getAllCampaings(@RequestParam(defaultValue = "10") int row,
                                                @RequestParam(defaultValue = "0") int page){
        return campaignService.getCampaigns(row, page);
    }

    @GetMapping(value = "/{id}" ,produces = "application/json")
    public CampaignDTO getCampaing(@PathVariable String id){
        return campaignService.getCampaign(id);
    }


}
