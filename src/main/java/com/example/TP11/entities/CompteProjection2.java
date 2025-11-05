package com.example.TP11.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "soldetype", types = Compte.class)
public interface CompteProjection2 {
    double getSolde();
    TypeCompte getType();
}