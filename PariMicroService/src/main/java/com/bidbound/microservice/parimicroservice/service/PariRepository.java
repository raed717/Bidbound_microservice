package com.bidbound.microservice.parimicroservice.service;

import com.bidbound.microservice.parimicroservice.entite.Pari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PariRepository extends JpaRepository<Pari, Long> {
}
