package com.bidbound.microservice.parimicroservice.service;

import com.bidbound.microservice.parimicroservice.entite.Pari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PariService implements IPariService{
    @Autowired
    private PariRepository pariRepository ;
    @Override
    public List<Pari> findAllParis() {
        return pariRepository.findAll() ;
    }

    @Override
    public Pari findPariById(Long id) {
        return pariRepository.findById(id).orElse(null) ;
    }

    @Override
    public Pari createPari(Pari pari) {
        return pariRepository.save(pari) ;
    }

    @Override
    public Pari updatePari( Pari Newpari) {
         Pari oldPari = pariRepository.findById(Newpari.getId()).orElse(null) ;
        if (oldPari != null ) {
            oldPari.setIdUser(Newpari.getIdUser()) ;
            oldPari.setIdProduit(Newpari.getIdProduit());
            oldPari.setGagnant(Newpari.getGagnant());
            oldPari.setSomme(Newpari.getSomme());

            return pariRepository.save(oldPari) ;
        }
        else {
            return null ;
        }
    }

    @Override
    public void deletePari(Long id) {
        this.pariRepository.deleteById(id);
    }
}
