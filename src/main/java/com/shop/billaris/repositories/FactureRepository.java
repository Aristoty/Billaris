package com.shop.billaris.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.shop.billaris.models.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {
    
}
