package com.shop.billaris.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idClient;

    private String nom;
    private String email;
    private String telephone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_id", referencedColumnName = "idAdresse")
    private Adresse adresse;


    @OneToMany(mappedBy = "client")
    private List<Facture> factures;




}
