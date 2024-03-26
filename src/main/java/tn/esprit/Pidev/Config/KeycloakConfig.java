package tn.esprit.Pidev.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.keycloak.admin.client.Keycloak;
import org.springframework.web.client.RestTemplate;

@Configuration
public class KeycloakConfig {


    @Bean
    public Keycloak keycloak() {
        return Keycloak.getInstance("http://localhost:8080/",
                "Pi-Dev", "admin", "admin", "pidev-client-ang");
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
