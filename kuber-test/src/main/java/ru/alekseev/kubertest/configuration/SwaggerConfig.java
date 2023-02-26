package ru.alekseev.kubertest.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "Kuber-test API")
)
@Configuration
public class SwaggerConfig {

    private static GroupedOpenApi createOpenApiGroup(String group, String path, String exclude) {
        return GroupedOpenApi.builder()
                .group(group)
                .pathsToMatch(path)
                .pathsToExclude(exclude)
                .build();
    }

    @Bean
    public GroupedOpenApi mainApi() {
        return createOpenApiGroup("Main", "/**", "/user");
    }

    @Bean
    public GroupedOpenApi userApi() {
        return createOpenApiGroup("User", "/user", "/");
    }

}
