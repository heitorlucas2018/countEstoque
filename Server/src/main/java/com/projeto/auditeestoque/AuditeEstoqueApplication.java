package com.projeto.auditeestoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@RequestMapping("")
public class AuditeEstoqueApplication extends SpringBootServletInitializer {

	@RequestMapping(value = {"","/"})
	@ResponseBody
	public String home() {
		
		return "Route Init...";
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AuditeEstoqueApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(AuditeEstoqueApplication.class, args);
	}

}
