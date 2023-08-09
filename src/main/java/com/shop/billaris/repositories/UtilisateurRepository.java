package com.shop.billaris.repositories;

import org.springframework.data.repository.CrudRepository;

import com.shop.billaris.models.Utilisateur;

public interface UtilisateurRepository extends CrudRepository <Utilisateur, Long>{
    Utilisateur findByNomUtilisateur(String nomUtilisateur);
}
