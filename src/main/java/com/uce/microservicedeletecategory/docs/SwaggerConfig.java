package com.uce.microservicedeletecategory.docs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@ComponentScan(basePackages = "com.uce.microservicedeletecategory.docs")
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Microservice delete Category API.")
                        .version("v1")
                        .description("This is the API documentation for the Delete Category microservice"));
    }
}