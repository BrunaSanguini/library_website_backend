package com.library.backend.model;

import com.library.backend.enums.Status;
import jakarta.persistence.*;

import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToMany
    private List<Genero> generos;

    @ManyToMany
    private List<Subgenero> subgeneros;

}