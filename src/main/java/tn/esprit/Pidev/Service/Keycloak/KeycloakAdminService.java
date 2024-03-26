package tn.esprit.Pidev.Service.Keycloak;

import org.springframework.web.client.RestTemplate;

public class KeycloakAdminService {
    private final RestTemplate restTemplate;
    private final String keycloakServerUrl;

    public KeycloakAdminService(RestTemplate restTemplate, String keycloakServerUrl) {
        this.restTemplate = restTemplate;
        this.keycloakServerUrl = keycloakServerUrl;
    }


}
