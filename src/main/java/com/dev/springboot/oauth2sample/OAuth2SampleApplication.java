package com.dev.springboot.oauth2sample;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OAuth2SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2SampleApplication.class, args);
	}
	
	@GetMapping()
	public String welcomePage() {
		return "Welcome to oAuthAuthentication";
	}
	
	@GetMapping("getuser")
	public Principal getUser(Principal principal) {
		return principal;
	}
}
