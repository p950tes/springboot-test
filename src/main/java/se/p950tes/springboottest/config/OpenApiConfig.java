package se.p950tes.springboottest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI api() {
		return new OpenAPI()
				.info(createApiInfo());
	}
	
	private Info createApiInfo() {
		return new Info()
				.title("Spring Boot Testing API")
				.version("0.1")
				.description("A simple test")
				.contact(new Contact().email("test@test.com"));
	}
}
