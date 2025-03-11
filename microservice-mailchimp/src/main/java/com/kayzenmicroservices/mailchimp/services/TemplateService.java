package com.kayzenmicroservices.mailchimp.services;

import com.kayzenmicroservices.mailchimp.dtos.TemplateRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.request.FolderRequestDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.TemplateFolderResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.TemplateResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.foldersTemplate.FolderResponseDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.template.TemplatesResponseDTO;

/**
 * Autor: William Castaño ;)
 * Fecha: 11/03/2025
 * Descripción:
 */

public interface TemplateService {
    public TemplateFolderResponseDTO getTemplateFolders(int row, int page);
    public FolderResponseDTO getTemplateFolder(String id);
    public FolderResponseDTO createTemplateFolder(FolderRequestDTO nameFolder);
    public TemplateResponseDTO getTemplates(int row, int page);
    public TemplatesResponseDTO getTemplate(String id);
    public TemplatesResponseDTO createTemplate(TemplateRequestDTO templateRequestDTO);

}
