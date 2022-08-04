package com.ravi.googleoauth2usingspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.sql.SQLOutput;

@SpringBootApplication
@RestController
public class GoogleOAuth2UsingSpringBootApplication {

	@GetMapping("/")
	public String welcome(){

		return "Welcome to google OAuth2";
	}

	@GetMapping("/user")
	public Principal welcome(Principal principal){

		System.out.println("user "+principal.getName());
		return principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(GoogleOAuth2UsingSpringBootApplication.class, args);
	}

}
