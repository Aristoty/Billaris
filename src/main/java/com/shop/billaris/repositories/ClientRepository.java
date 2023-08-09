package com.shop.billaris.repositories;

import org.springframework.data.repository.CrudRepository;

import com.shop.billaris.models.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
    
}
