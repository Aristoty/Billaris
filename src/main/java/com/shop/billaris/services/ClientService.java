package com.shop.billaris.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.billaris.models.Client;
import com.shop.billaris.repositories.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients(){
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);
        return clients;
    }

    public Client getClientById(Long idClient){
        return clientRepository.findById(idClient).orElse(null);
    }

    public void createClient(Client client){
        clientRepository.save(client);
    }

    public void updateClient(Client client,Long idClient){
        clientRepository.save(client);
    }

    public void deleteClient(Long idClient){
        clientRepository.deleteById(idClient);
    }
    
}
