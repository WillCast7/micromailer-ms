package com.kayzenmicroservices.mailchimp.controllers;

import com.kayzenmicroservices.mailchimp.dtos.MembresResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.audienceList.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.services.AudienceService;
import com.kayzenmicroservices.mailchimp.services.impl.AudienceMembersServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: audience all controller
 */
@RestController
@RequestMapping("/lists")
public class AudienceController {

    @Autowired
    AudienceService audienceService;

    @Autowired
    AudienceMembersServiceImpl audienceMembersService;

    @GetMapping
    public AudienceMembersDTO getAllAudiences(@RequestParam(defaultValue = "10") int row,
                                              @RequestParam(defaultValue = "0") int page){
        return audienceService.getAudienceList(row, page);
    }

    @GetMapping(value = "/{id}")
    public AudienceMembersDTO getAudienceById(@PathVariable String id){
        return audienceService.getAudience(id);
    }

    @PostMapping
    public AudienceMembersDTO createAudience(@Valid @RequestBody AudienceMembersDTO body){
        return audienceService.createAudience(body);
    }

    @GetMapping(value = "/{id}/members")
    public MembresResponseDTO getMembersById(@RequestParam(defaultValue = "10") int row,
                                             @RequestParam(defaultValue = "0") int page,
                                             @PathVariable String id){
        return audienceMembersService.getAudienceMemberList(row, page, id);
    }

    @GetMapping(value = "/{id}/members/{idMember}")
    public AudienceMembersDTO getMembersById(@PathVariable String id,
                                             @PathVariable String idMember){
        return audienceMembersService.getMember(id, idMember);
    }

}
