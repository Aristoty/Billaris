package com.shop.billaris.controllers;

import com.shop.billaris.models.Adresse;
import com.shop.billaris.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adresses")
public class AdresseController {

    @Autowired
    private AdresseService adresseService;

    @GetMapping("/allAdresses")
    public ResponseEntity<List<Adresse>> getAllAdresses(){
        List<Adresse> adresses = adresseService.getAllAdresses();
        return ResponseEntity.ok(adresses);
    }

    @GetMapping("/adresse/{idAdresse}")
    public ResponseEntity<Adresse> getAdresseById(@PathVariable Long idAdresse){
        Adresse adresse = adresseService.getAdresseById(idAdresse);
        return ResponseEntity.ok(adresse);
    }

    @PostMapping("/createAdresse")
    public void  createAdresse(@RequestBody Adresse adresse){
        adresseService.createAdresse(adresse);
    }

    @PutMapping("/updateAdresse/{idAdresse}")
    public void updateAdresse(@RequestBody Adresse adresse, @PathVariable Long idAdresse){
        adresseService.updateAdresse(adresse, idAdresse);
    }

    @DeleteMapping("/{idAdresse}")
    public void deleteAdresse(@PathVariable Long idAdresse){
        adresseService.deleteAdresse(idAdresse);
    }

}
