package com.kayzenmicroservices.mailchimp.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class WebClientServiceImpl {

    private final WebClient webClient = WebClient.builder()
            .baseUrl("https://usX.api.mailchimp.com/3.0") // Reemplaza "usX" con el datacenter correcto
            .defaultHeader(HttpHeaders.AUTHORIZATION, "Basic " + "anystring:YOUR_API_KEY")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();


    public String getCampaigns() {
        return webClient.get()
                .uri("/campaigns")
                .retrieve()
                .bodyToMono(String.class) // Convierte la respuesta a String
                .block(); // Hace la llamada BLOQUEANTE
    }
}
