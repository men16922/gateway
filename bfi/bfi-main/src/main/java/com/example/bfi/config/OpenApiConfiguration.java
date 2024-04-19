package com.example.bfi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "BFI Service APIs",
                description = "XR-Friends BFI Service API",
                version = "v1"
        )
//        servers = {@Server(url = "/services/backend/", description = "Default Server URL")}
//        servers = {@Server(url = "http://127.0.0.1:8088/services/backend"), @Server(url = "http://localhost:8088/services/backend"), @Server(url = "http://localhost:8080/services/backend")}
)
@Configuration
public class OpenApiConfiguration {
}
