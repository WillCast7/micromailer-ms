package com.kayzenmicroservices.mailchimp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: Microservice for send Emails and massive emails with mailchimp
 */

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceMailchimpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceMailchimpApplication.class, args);
	}

}
