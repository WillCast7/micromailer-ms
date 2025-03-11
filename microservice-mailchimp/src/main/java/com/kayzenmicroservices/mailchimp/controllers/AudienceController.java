package com.kayzenmicroservices.mailchimp.controllers;

import com.kayzenmicroservices.mailchimp.dtos.MembresResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.AudienceMemberListCreationBodyDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.services.AudienceMembersService;
import com.kayzenmicroservices.mailchimp.services.AudienceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    AudienceMembersService audienceMembersService;

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

    @PostMapping("/{id}/members")
    public List<String> createAudience(@PathVariable String id,
                                      @Valid @RequestBody AudienceMemberListCreationBodyDTO customerList){
        return audienceMembersService.createMemberListInAudience(id, customerList);
    }

}
