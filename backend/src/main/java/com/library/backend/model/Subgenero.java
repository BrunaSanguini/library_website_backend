package com.library.backend.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Subgenero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    private Genero genero;

}
