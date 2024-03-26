package tn.esprit.Pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.Pidev.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
