package com.shop.billaris.services;

import com.shop.billaris.models.Utilisateur;
import com.shop.billaris.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> getAllUtlisateurs(){
        List<Utilisateur> utilisateurs = new ArrayList<>();
        utilisateurRepository.findAll().forEach(utilisateurs::add);
        return utilisateurs;

    }

    public  Utilisateur findByNomUtilisateurs(String nomUtilisateur){
        return utilisateurRepository.findByNomUtilisateur(nomUtilisateur);
    }

    public Utilisateur getUtilisateurById(Long idUtilisateur){
        return utilisateurRepository.findById(idUtilisateur).orElse(null);
    }

    public void  createUtilisateur (Utilisateur utilisateur){
        utilisateurRepository.save(utilisateur);
    }

    public  void updateUtilisateur (Utilisateur utilisateur,Long idUtilisateur ){
        utilisateurRepository.save(utilisateur);
    }

    public void deleteUtilisateur (Long idUtilisateur){
        utilisateurRepository.deleteById(idUtilisateur);
    }

    
}
