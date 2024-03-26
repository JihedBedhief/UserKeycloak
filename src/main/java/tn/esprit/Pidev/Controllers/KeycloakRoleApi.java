package tn.esprit.Pidev.Controllers;

import lombok.RequiredArgsConstructor;
import org.keycloak.admin.client.resource.RolesResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Pidev.Service.Keycloak.RoleService;

import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class KeycloakRoleApi {

    private final RoleService roleService;


    @GetMapping
    public RolesResource getAll(){
        return roleService.getRoles();
    }
    @PutMapping("/assign-role/user/{userId}")
    public ResponseEntity<?> assignRole(@PathVariable String userId, @RequestParam String roleName){

        roleService.assignRole(userId, roleName);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
