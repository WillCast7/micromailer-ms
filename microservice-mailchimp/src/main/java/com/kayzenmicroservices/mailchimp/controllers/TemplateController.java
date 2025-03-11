package com.kayzenmicroservices.mailchimp.controllers;

import com.kayzenmicroservices.mailchimp.dtos.TemplateRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.FolderRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.TemplateFolderResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.TemplateResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.foldersTemplate.FolderResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.template.TemplatesResponseDTO;
import com.kayzenmicroservices.mailchimp.services.TemplateService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Autor: William Castaño ;)
 * Fecha: 11/03/2025
 * Descripción:
 */

@RestController
@RequestMapping("/template")
public class TemplateController {

    @Autowired
    TemplateService templateService;

    @GetMapping
    public TemplateResponseDTO getAllTemplates(@RequestParam(defaultValue = "10") int row,
                                               @RequestParam(defaultValue = "0") int page){
        return templateService.getTemplates(row, page);
    }

    @GetMapping(value = "/{id}" ,produces = "application/json")
    public TemplatesResponseDTO getTemplate(@PathVariable String id){
        return templateService.getTemplate(id);
    }

    @PostMapping
    public TemplatesResponseDTO createTemplate(@Valid @RequestBody TemplateRequestDTO templateParams){
        return templateService.createTemplate(templateParams);
    }

    @GetMapping("/folders")
    public TemplateFolderResponseDTO getAllFolders(@RequestParam(defaultValue = "10") int row,
                                                   @RequestParam(defaultValue = "0") int page){
        return templateService.getTemplateFolders(row, page);
    }

    @GetMapping(value = "/folders/{id}" ,produces = "application/json")
    public FolderResponseDTO getFolder(@PathVariable String id){
        return templateService.getTemplateFolder(id);
    }

    @PostMapping("/folders")
    public FolderResponseDTO createFolder(@Valid @RequestBody FolderRequestDTO name){
        return templateService.createTemplateFolder(name);
    }


}
