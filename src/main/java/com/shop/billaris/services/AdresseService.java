package com.shop.billaris.services;

import com.shop.billaris.models.Adresse;
import com.shop.billaris.repositories.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdresseService {

    @Autowired
    private AdresseRepository adresseRepository;

    public List<Adresse> getAllAdresses(){
        List<Adresse> adresses = new ArrayList<>();
        adresseRepository.findAll().forEach(adresses::add);
        return adresses;
    }

    public Adresse getAdresseById(Long idAdresse){
        return adresseRepository.findById(idAdresse).orElse(null);
    }

    public void createAdresse(Adresse adresse){
        adresseRepository.save(adresse);
    }

    public void updateAdresse(Adresse adresse, Long idAdresse){
        adresseRepository.save(adresse);
    }

    public void deleteAdresse(Long idAdresse){
        adresseRepository.findById(idAdresse);
    }
}
