package com.shop.billaris.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shop.billaris.models.Client;
import com.shop.billaris.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.billaris.repositories.FactureRepository;

@Service
public class FactureService {

    @Autowired
    private FactureRepository factureRepository;

    @Autowired
    private ClientService clientService;

    @Autowired
    private ProduitService produitService;

    public List<Facture> getAllFactures(){
        List<Facture> factures = new ArrayList<>();
        factureRepository.findAll().forEach(factures::add);
        return factures;
    }
    
    public Facture getFactureById(Long idFacture){
        return factureRepository.findById(idFacture).orElse(null);
    }


    public void createFacture(Facture facture){
        Client Client;
        Optional<Client> client = clientService.getClientById(facture.getClass(Client).getIdClient());
        if (client == null || facture.getClass(produit).isEmpty()){

        }
        factureRepository.save(facture);
    }

    public void updateFacture(Facture facture, Long idFacture){

        factureRepository.save(facture);
    }

    public void deleteFacture(Long idFacture){
        factureRepository.deleteById(idFacture);
    }
}
