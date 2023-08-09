package com.shop.billaris.services;

import com.shop.billaris.models.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.billaris.repositories.ProduitRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getAllProduits(){
        List<Produit> produits = new ArrayList<>();
        produitRepository.findAll().forEach(produits:: add);
        return produits;
    }

    public Produit getProduitById(Long idProduit){
        return produitRepository.findById(idProduit).orElse(null);
    }

    public void createProduit(Produit produit){
        produitRepository.save(produit);
    }

    public void updateProduit(Produit produit, Long idProduit){
        produitRepository.save(produit);
    }

    public void deleteProduit(Long idProduit){
        produitRepository.deleteById(idProduit);
    }


}
