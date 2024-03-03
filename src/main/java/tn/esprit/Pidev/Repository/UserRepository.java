package tn.esprit.Pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Pidev.Entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
