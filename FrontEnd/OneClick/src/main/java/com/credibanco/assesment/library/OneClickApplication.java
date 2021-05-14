package com.credibanco.assesment.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class OneClickApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneClickApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/libro/create")
						.allowedOrigins("http://localhost:8080","http://localhost:4200");
				registry.addMapping("/libro/find")
						.allowedOrigins("http://localhost:8080","http://localhost:4200");
				registry.addMapping("/autor/find")
						.allowedOrigins("http://localhost:8080","http://localhost:4200");
				registry.addMapping("/autor/create")
						.allowedOrigins("http://localhost:8080","http://localhost:4200");
				registry.addMapping("/editorial/create")
						.allowedOrigins("http://localhost:8080","http://localhost:4200");
				registry.addMapping("/editorial/find")
						.allowedOrigins("http://localhost:8080","http://localhost:4200");
			}
		};
	}

}
