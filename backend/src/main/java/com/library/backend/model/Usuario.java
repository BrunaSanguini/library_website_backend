package com.library.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Usuario {

    @Id
    private Long id;

    private String nome;

    private String apelido;

    private String email;

    private String senha;

    @ManyToMany
    private List<Livro> estante;

    @ManyToMany
    private List<Livro> wishList;

    @ManyToOne
    private Historico historico;




}
