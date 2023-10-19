package tn.esprit.produit.Services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.produit.Entities.Livraison;
import tn.esprit.produit.Interfaces.LivraisonInterface;
import tn.esprit.produit.Repositories.LiRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j

public class LivraisonService  implements LivraisonInterface {

    LiRepository livraisonrepo;


    @Override
    public Livraison ajouterLivraison( Livraison livraison ) {
        return livraisonrepo.save(livraison);
    }

    @Override
    public Livraison findLivraisonById( Integer id ) {
        return livraisonrepo.findById(id).orElse(null);
    }

    @Override
    public List <Livraison> findAll() {
        return livraisonrepo.findAll();
    }


    @Override
    public Livraison updateLivraison( Integer Id,Livraison livraisonDetails) {
        Livraison oldlivraison =  livraisonrepo.findById(Id).orElse(null);
        oldlivraison.setDate(livraisonDetails.getDate());
        oldlivraison.setNumero(livraisonDetails.getNumero());
        oldlivraison.setMontantTotal(livraisonDetails.getMontantTotal());

        return livraisonrepo.save(oldlivraison);
    }

    @Override
    public void deleteLivraison( Integer Id ) {
        livraisonrepo.deleteById(Id);
        log.info("livraison deleted");


    }
}