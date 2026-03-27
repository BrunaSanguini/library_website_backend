package com.library.backend.model;

import jakarta.persistence.*;

import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String autor;

    private String editora;

    private String isbn;

    private Integer paginas;

    private Integer anoPublicado;

    private String sinopse;

    private int vezesLido;

    private String idioma;

    @ManyToMany
    private List<Genero> generos;

    @ManyToMany
    private List<Subgenero> subgeneros;

}