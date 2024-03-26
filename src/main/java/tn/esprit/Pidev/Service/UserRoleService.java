package tn.esprit.Pidev.Service;

import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.RoleRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserRoleService {
    private final Keycloak keycloak;

    @Autowired
    public UserRoleService(Keycloak keycloak) {
        this.keycloak = keycloak;
    }

    public List<String> getAvailableRoles(String realmName) {
        // Fetching all realm roles
        List<RoleRepresentation> roles = keycloak.realm(realmName).roles().list();

        // Filtering or modifying the list as necessary. For example, excluding certain roles
        return roles.stream()
                .map(RoleRepresentation::getName)
                .collect(Collectors.toList());
    }
}
