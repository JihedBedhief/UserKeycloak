package tn.esprit.Pidev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Pidev.Entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
