package com.bidbound.microservice.parimicroservice.service;

import com.bidbound.microservice.parimicroservice.entite.Pari;

import java.util.List;

public interface IPariService {
    List<Pari> findAllParis();
    Pari findPariById(Long id);
    Pari createPari(Pari pari);
    Pari updatePari( Pari Newpari);
    void deletePari(Long id);

}
