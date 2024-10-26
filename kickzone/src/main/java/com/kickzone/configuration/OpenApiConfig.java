package com.kickzone.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "MohamedBoukthir",
                        email = "medboukthir7@gmail.com",
                        url = "https://github.com/MohamedBoukthir"
                ),
                description = "OpenApi docs for kickzone api",
                title = "kickzone API",
                version = "1.0.0",
                license = @License(
                        name = "kickzone",
                        url = "https://stillWorkingOnIt.com" // i still working on it (fake link)
                ),
                termsOfService = "https://stillWorkingOnIt.com" // i still working on it (fake link)
        ),
        servers = {
                @Server(
                        description = "localhost",
                        url = "https://stillWorkingOnIt.com" // i still working on it (fake link)
                ),
        },
        security = {
                @SecurityRequirement(
                        name = "keycloakAuth"
                )
        }
)
@SecurityScheme(
        name = "keycloakAuth",
        description = "keycloak auth",
        scheme = "keycloak",
        type = SecuritySchemeType.HTTP,
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
