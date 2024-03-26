package tn.esprit.Pidev.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "_user_Info")
public class User {

    @jakarta.persistence.Id
    @Id
    private String id;
    private Long phoneNumber;
    private String adress ;




}
