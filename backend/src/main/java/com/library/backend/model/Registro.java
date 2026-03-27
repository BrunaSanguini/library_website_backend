package com.library.backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Registro {

    @Id
    private Long id;

    @ManyToOne
    private Historico historico;

    private LocalDate inicioLeitura;

    private LocalDate fimLeitura;

    @ManyToOne
    private Livro livroLido;

    private String resenha;

    private double estrelas;


}
