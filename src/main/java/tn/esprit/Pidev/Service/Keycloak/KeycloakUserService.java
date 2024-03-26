package tn.esprit.Pidev.Service.Keycloak;

import org.keycloak.representations.idm.UserRepresentation;

public interface KeycloakUserService {
    void deleteUserById(String userId);

    UserRepresentation getUserById(String userId);
}
