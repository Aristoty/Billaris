package com.shop.billaris.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shop.billaris.models.Client;
import com.shop.billaris.services.ClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/allClient")
    public ResponseEntity<List<Client>> getAllClients(){
        List<Client> clients = clientService.getAllClients();
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/client/{idClient}")
    public ResponseEntity<Client> getClientById(@PathVariable Long idClient){
        Client client = clientService.getClientById(idClient);
        return  ResponseEntity.ok(client);
    }

    @PostMapping("/createClient")
    public void createClient(@RequestBody Client client){
        clientService.createClient(client);
    }

    @PutMapping("/updateClient/{idClient}")
    public void updateClient(@RequestBody Client client, @PathVariable Long idClient){
        clientService.updateClient(client, idClient);
    }

    @DeleteMapping("/{idClient}")
    public void deleteClient(@PathVariable Long idClient){
        clientService.deleteClient(idClient);
    }
}
