package com.crepic.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TerritorioAventurasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerritorioAventurasApiApplication.class, args);
	}
}
