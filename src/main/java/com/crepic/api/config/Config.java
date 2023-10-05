package com.crepic.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import javax.sql.DataSource;
import java.util.List;

@Configuration
public class Config {

	@Bean
	public DataSource dataSource() {
		String url = "", user = "", password = "";

		if(false){
			url = "jdbc:mysql://" + "localhost:3306/" + "territorioaventurasdb";
			user = "root";
			password = "";
		}else{
			url = "jdbc:mysql://" + "territorio-aventuras-db.cockz87dqo2x.us-east-1.rds.amazonaws.com/" + "territorioaventurasdb";
			user = "root";
			password = "root1234";
		}

		return DataSourceBuilder.create()
				.driverClassName("com.mysql.cj.jdbc.Driver")
				.url(url)
				.username(user)
				.password(password)
				.build();
	}

	@Bean
	public WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*")
						.allowedMethods("*")
						.allowedHeaders("*");
			}
		};
	}

	@Bean
	public OpenAPI myOpenAPI() {
		Server devServer = new Server();
		devServer.setUrl("");
		devServer.setDescription("Servidor Localhost DEV");

		Contact contact = new Contact();
		contact.setEmail("API");
		contact.setName("API");
		contact.setUrl("API");

		License mitLicense = new License().name("MIT License").url("API");

		Info info = new Info()
				.title("Territorio de Aventuras API")
				.version("1.0")
				.contact(contact)
				.description("API SpringBoot Java para servicios del video juego Territorio de Aventuras").termsOfService("")
				.license(mitLicense);

		return new OpenAPI().info(info).servers(List.of(devServer));
	}

}
