package tn.esprit.Pidev.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Pidev.Entities.User;
import tn.esprit.Pidev.Repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository ;

    @Override
    public User addUserInfo(User user) {
        return  userRepository.save(user);
    }

    @Override
    public User updateUserInfo(String id, User user) {
        User user1 = userRepository.findById(id).get();
        user1.setAdress(user.getAdress());
        //user1.setBirthDate(user.getBirthDate());
        user1.setPhoneNumber(user.getPhoneNumber());
        return userRepository.save(user1) ;

    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).get();
    }
}
