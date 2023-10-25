

package com.example.enchere.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.enchere.Entities.Enchere;
import com.example.enchere.Repositories.EnchereRepo;


public class EnchereService {

    private final EnchereRepo enchereRepository;

    @Autowired
    public EnchereService(EnchereRepository enchereRepository) {
        this.enchereRepository = enchereRepository;
    }

    public Enchere createEnchere(Enchere enchere) {
        return userRepository.save(enchere);
    }

    public Enchere getEnchereById(Long id) {
        return enchereRepository.findById(id).orElse(null);
    }

    public Enchere updateEnchere(Enchere enchere) {
        return enchereRepository.save(enchere);
    }

    public void deleteEnchere(Long id) {enchereRepository.deleteById(id);
    }


    }

