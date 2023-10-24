package com.bidbound.microservice.parimicroservice.entite;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Pari implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Long idUser ;
    private Long idProduit ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public int getSomme() {
        return somme;
    }

    public void setSomme(int somme) {
        this.somme = somme;
    }

    public Date getDepoDate() {
        return depoDate;
    }

    public void setDepoDate(Date depoDate) {
        this.depoDate = depoDate;
    }

    public Boolean getGagnant() {
        return Gagnant;
    }

    public void setGagnant(Boolean gagnant) {
        Gagnant = gagnant;
    }

    private int somme ;
    private Date depoDate ;
    private Boolean Gagnant ;

}
