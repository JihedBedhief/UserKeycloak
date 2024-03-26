package tn.esprit.Pidev.Service.Keycloak;

import org.keycloak.admin.client.resource.RolesResource;
import org.keycloak.representations.idm.RoleRepresentation;

import java.util.List;

public interface RoleService {
    void assignRole(String userId, String roleName);

    RolesResource getRoles();
}
