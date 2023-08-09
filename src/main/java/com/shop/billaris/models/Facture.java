package com.shop.billaris.models;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;

    private String numeroFacture;
    private String date;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany
    @JoinTable(
        name = "facture_produit",
        joinColumns = @JoinColumn(name= "facture_id"),
        inverseJoinColumns = @JoinColumn(name= "produit_id")
    )
    Set<Produit> listProduits;

    @ManyToMany
    @JoinTable(
            name = "facture_adresse",
            joinColumns =  @JoinColumn(name = "facture_id"),
            inverseJoinColumns = @JoinColumn(name = "adresse_id")
    )
    Set<Adresse> adresseFacture;


    
}
