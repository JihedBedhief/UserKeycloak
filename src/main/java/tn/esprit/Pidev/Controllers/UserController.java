package tn.esprit.Pidev.Controllers;


import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Pidev.Entities.User;
import tn.esprit.Pidev.Service.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserServiceImpl userService ;

    @Autowired
    private Keycloak keycloak;

    @GetMapping("/liste-users")
    public List<UserRepresentation> getUserList() {
        RealmResource realmResource = keycloak.realm("Pi-Dev");
        return realmResource.users().list();
    }

    @PostMapping("add-info")
    public User addUserInfo( @RequestBody User user){
        return userService.addUserInfo(user);
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable("id") String id){
        return userService.getUserById(id);
    }

}
