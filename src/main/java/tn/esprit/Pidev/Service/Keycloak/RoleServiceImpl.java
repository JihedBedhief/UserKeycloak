package tn.esprit.Pidev.Service.Keycloak;

import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.resource.RolesResource;
import org.keycloak.admin.client.resource.UserResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class RoleServiceImpl implements RoleService{

    private String realm = "pidev";
    private Keycloak keycloak;

    @Autowired
    KeycloakUserServiceImpl keycloakUserService;
    @Override
    public void assignRole(String userId, String roleName) {

        UserResource userResource = keycloakUserService.getUserResource(userId);
        RolesResource rolesResource = getRolesResource();
        RoleRepresentation representation = rolesResource.get(roleName).toRepresentation();
        userResource.roles().realmLevel().add(Collections.singletonList(representation));

    }

    private RolesResource getRolesResource(){
        return  keycloak.realm(realm).roles();
    }

    public RolesResource getRoles(){
        return  keycloak.realm(realm).roles();
    }

}
