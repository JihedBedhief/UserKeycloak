package tn.esprit.Pidev.Service;

import tn.esprit.Pidev.Entities.User;

public interface UserService {
    User addUserInfo(User user);
    User updateUserInfo(String id ,User user);

    User getUserById(String id);
}
