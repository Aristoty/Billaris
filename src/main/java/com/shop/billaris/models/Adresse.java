package com.shop.billaris.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adresse {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idAdresse;

    private String rue;
    private String ville;
    private String etat;
    private String CodePostal;
    private String pays;

    @OneToOne(mappedBy = "adresse")
    private Client client;

    @ManyToMany(mappedBy = "adresseFacture")
    Set<Facture> factures;


}
