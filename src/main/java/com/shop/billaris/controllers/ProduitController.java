package com.shop.billaris.controllers;

import com.shop.billaris.models.Produit;
import com.shop.billaris.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produits")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/allProduits")
    public ResponseEntity<List<Produit>> getAllProduits(){
        List<Produit> produits = produitService.getAllProduits();
        return ResponseEntity.ok(produits);
    }

    @GetMapping("/produit/{idProduit}")
    public  ResponseEntity<Produit> getProduitById(@PathVariable Long idProduit){
        Produit produit = produitService.getProduitById(idProduit);
        return ResponseEntity.ok(produit);
    }

    @PostMapping("/createProduit")
    public void createProduit(@RequestBody Produit produit){
        produitService.createProduit(produit);
    }

    @PutMapping("/updateProduit/{idProduit}")
    public void updateProduit(@RequestBody Produit produit, @PathVariable Long idProduit){
        produitService.updateProduit(produit, idProduit);
    }

    @DeleteMapping("/{idProduit}")
    public void deleteProduit(@PathVariable Long idProduit){
        produitService.deleteProduit(idProduit);
    }

    
}
