package tn.esprit.Pidev;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.esprit.Pidev.Entities.Product;
import tn.esprit.Pidev.Repository.ProductRepository;

import java.util.UUID;

@SpringBootApplication
public class PidevBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PidevBackApplication.class, args);
	}



}
