package com.kayzenmicroservices.mailchimp.services.impl;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: WebClient of Mailchimp
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class WebClientServiceImpl {

    @org.springframework.beans.factory.annotation.Value("${mailchimp.api.base-url}")
    private String mailchimpBaseUrl;

    @org.springframework.beans.factory.annotation.Value("${mailchimp.api.key}")
    private String mailchimpApiKey;

    WebClient webClient;

    @PostConstruct
    public void initWebClient() {
        log.info("Inicializando WebClient con URL base: {}", mailchimpBaseUrl);
        this.webClient = WebClient.builder()
                .baseUrl(mailchimpBaseUrl)
                .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + mailchimpApiKey)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
