package com.argos.authserver.giftCardAuthServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;

@SpringBootApplication
public class GiftCardAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiftCardAuthServerApplication.class, args);
	}
	


}
