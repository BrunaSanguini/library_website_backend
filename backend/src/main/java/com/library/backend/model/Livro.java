package com.library.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "livros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    private String editora;

    @NotBlank
    @Size(min = 10, max = 13)
    private String isbn;

    @NotNull
    @Min(1)
    private Integer paginas;

    @NotNull
    @Min(0)
    private Integer ano;

    @Column(length = 2000)
    private String descricao;

    @Column(length = 2000)
    private String resenha;

    @ElementCollection(targetClass = Genero.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "livro_generos",
            joinColumns = @JoinColumn(name = "livro_id")
    )
    @Column(name = "genero")
    private Set<Genero> generos;

    @ElementCollection(targetClass = Subgenero.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "livro_subgeneros",
            joinColumns = @JoinColumn(name = "livro_id")
    )
    @Column(name = "subgenero")
    private Set<Subgenero> subgeneros;

}