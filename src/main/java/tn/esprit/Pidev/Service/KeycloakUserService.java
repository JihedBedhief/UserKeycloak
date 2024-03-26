package tn.esprit.Pidev.Service;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class KeycloakUserService {

  @Bean
    public Keycloak keycloak(){
      return KeycloakBuilder.builder()
              .serverUrl("http://localhost:8080")
              .realm("pidev")
              .grantType(OAuth2Constants.PASSWORD)
              .clientId("admin-cli")
              .username("admin")
              .password("admin")
              .build();
  }
}
