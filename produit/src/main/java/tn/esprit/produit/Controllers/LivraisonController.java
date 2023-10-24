package tn.esprit.produit.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;
import tn.esprit.produit.Entities.Livraison;
import tn.esprit.produit.Interfaces.LivraisonInterface;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping ("/Livraison")
public class LivraisonController {

LivraisonInterface servl;


    @GetMapping ("/getlivraison")
    public List <Livraison> getLivraisons() {
        return servl.findAll();
    }

    @GetMapping("/Alllivraison/{id}")
    public Livraison retrievelivraison(@PathVariable Integer id) {
        return servl.findLivraisonById(id);
    }

    @PostMapping ("/addlivraison")
    public Livraison addLivraison(@RequestBody Livraison livraison) {
        return servl.ajouterLivraison(livraison);
    }

    @DeleteMapping("/deletelivraison/{id}")
    public void removeLivraison(@PathVariable Integer id) {
        servl.deleteLivraison(id);
    }

    @PutMapping ( "update-livraison/{id}" )
    public Livraison updatelivraison( @PathVariable Integer id ,@RequestBody Livraison livraisonDetails ) {
        return servl.updateLivraison(id ,livraisonDetails);
    }

}
