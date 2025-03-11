package com.kayzenmicroservices.mailchimp.services.impl;

import com.kayzenmicroservices.mailchimp.dtos.TemplateRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.FolderRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.TemplateFolderResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.TemplateResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.foldersTemplate.FolderResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.template.TemplatesResponseDTO;
import com.kayzenmicroservices.mailchimp.services.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;

/**
 * Autor: William Castaño ;)
 * Fecha: 11/03/2025
 * Descripción: Service for template and template folder
 */

@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    WebClientServiceImpl webClientService;

    public TemplateFolderResponseDTO getTemplateFolders(int row, int page) {
        return webClientService.webClient.get()
                .uri("template-folders?count=" + row + "&offset=" + page)
                .retrieve()
                .bodyToMono(TemplateFolderResponseDTO.class)
                .block();
    }

    public FolderResponseDTO getTemplateFolder(String id) {
        return webClientService.webClient.get()
                .uri("template-folders/" + id)
                .retrieve()
                .bodyToMono(FolderResponseDTO.class)
                .block();
    }

    public FolderResponseDTO createTemplateFolder(FolderRequestDTO folderRequestDTO) {
        return webClientService.webClient.post()
                .uri("template-folders")
                .body(BodyInserters.fromValue(folderRequestDTO))
                .retrieve()
                .bodyToMono(FolderResponseDTO.class)
                .block();
    }

    public TemplateResponseDTO getTemplates(int row, int page) {
        return webClientService.webClient.get()
                .uri("templates?count=" + row + "&offset=" + page)
                .retrieve()
                .bodyToMono(TemplateResponseDTO.class)
                .block();
    }

    public TemplatesResponseDTO getTemplate(String id) {
        return webClientService.webClient.get()
                .uri("templates/" + id)
                .retrieve()
                .bodyToMono(TemplatesResponseDTO.class)
                .block();
    }

    public TemplatesResponseDTO createTemplate(TemplateRequestDTO templateRequestDTO) {
        return webClientService.webClient.post()
                .uri("templates")
                .body(BodyInserters.fromValue(templateRequestDTO))
                .retrieve()
                .bodyToMono(TemplatesResponseDTO.class)
                .block();
    }

}
