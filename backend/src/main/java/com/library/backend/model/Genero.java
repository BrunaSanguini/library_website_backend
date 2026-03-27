package com.library.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Genero {

    private String nome;

    @OneToMany
    private List<Subgenero> subgeneros;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}