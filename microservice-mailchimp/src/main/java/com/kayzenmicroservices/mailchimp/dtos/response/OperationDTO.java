package com.kayzenmicroservices.mailchimp.dtos.response;


public record OperationDTO(String method, String path, String body) {
}
