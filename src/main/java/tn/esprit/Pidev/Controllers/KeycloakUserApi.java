package tn.esprit.Pidev.Controllers;

import lombok.AllArgsConstructor;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import tn.esprit.Pidev.Service.Keycloak.KeycloakUserServiceImpl;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class KeycloakUserApi {

    private final String realm ="Pi-Dev";
    private final String serverUrl = "http://localhost:8080/";
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    Keycloak keycloak;
    private final KeycloakUserServiceImpl keycloakUserService;

    @GetMapping("/users")
    public List<UserRepresentation> getAllUsers() {
        return keycloak.realm("Pi-Dev").users().list();
    }

    @GetMapping("/roles")
    public List<RoleRepresentation> getAllRoles() {
        return keycloak.realm("Pi-Dev").roles().list();
    }

    @GetMapping
    public UserRepresentation getUser(Principal principal) {
        return keycloakUserService.getUserById(principal.getName());
    }



    @GetMapping("/all1")
    public List<UserRepresentation> listUsers111() {
        return keycloak.realm("Pi-Dev").users().list();
    }

    @GetMapping("/all")
    public List<UserRepresentation> listUsers() {
        return keycloakUserService.getUsersResource().list();
    }

    @RequestMapping("/liste-users")
    public List<UserRepresentation> getUserList() {
        RealmResource realmResource = keycloak.realm("Pi-Dev");
        return realmResource.users().list();
    }


}

