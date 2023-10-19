package tn.esprit.produit.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults (level= AccessLevel.PRIVATE)
@Entity
public class Livraison implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;
    String numero;
    Date date;
    Double montantTotal;
}
