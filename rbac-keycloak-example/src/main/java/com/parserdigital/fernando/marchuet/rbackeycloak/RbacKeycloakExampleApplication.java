package com.parserdigital.fernando.marchuet.rbackeycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class RbacKeycloakExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbacKeycloakExampleApplication.class, args);
	}

}
