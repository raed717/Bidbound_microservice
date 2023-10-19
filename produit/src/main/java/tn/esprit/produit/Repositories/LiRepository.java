package tn.esprit.produit.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.produit.Entities.Livraison;

@Repository

public interface LiRepository extends JpaRepository <Livraison, Integer> {
}
