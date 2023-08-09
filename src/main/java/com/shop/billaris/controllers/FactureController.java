package com.shop.billaris.controllers;

import com.shop.billaris.models.Facture;
import com.shop.billaris.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factures")
public class FactureController {

    @Autowired
    private FactureService factureService;

    @GetMapping("/allFactures")
    public ResponseEntity<List<Facture>> getAllFactures(){
        List<Facture> Factures = factureService.getAllFactures();
        return ResponseEntity.ok(Factures);
    }

    @GetMapping("/facture/{idFacture}")
    public ResponseEntity<Facture> getFactureById(@PathVariable Long idFacture){
        Facture facture = factureService.getFactureById(idFacture);
        return ResponseEntity.ok(facture);
    }

    @PostMapping("/createFacture")
    public  void  createFacture(@RequestBody Facture facture){
        factureService.createFacture(facture);
    }

    @PutMapping("/updateFacture/{idFacture}")
    public void updateFacture(@RequestBody Facture facture,@PathVariable Long idFacture){
        factureService.updateFacture(facture, idFacture);
    }

    @DeleteMapping("/deleteFacture")
    public  void deleteFacture(@PathVariable Long idFacture){
        factureService.deleteFacture(idFacture);   }
}
