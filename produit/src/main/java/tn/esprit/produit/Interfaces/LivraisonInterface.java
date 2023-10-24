package tn.esprit.produit.Interfaces;

import tn.esprit.produit.Entities.Livraison;

import java.util.List;

public interface LivraisonInterface {


     Livraison ajouterLivraison( Livraison livraison );


     Livraison findLivraisonById( Integer id );

     List <Livraison> findAll();

      Livraison updateLivraison( Integer Id,Livraison livraisonDetails) ;

     void deleteLivraison( Integer Id ) ;


    }
