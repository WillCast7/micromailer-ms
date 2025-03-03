package com.kayzenmicroservices.mailchimp.dtos;

import lombok.Getter;
import lombok.Setter;


public record OperationDTO(String method, String path, String body) {
}
