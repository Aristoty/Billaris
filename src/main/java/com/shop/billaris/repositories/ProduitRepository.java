package com.shop.billaris.repositories;

import org.springframework.data.repository.CrudRepository;

import com.shop.billaris.models.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Long> {
    
}

