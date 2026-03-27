package com.library.backend.dto;

import com.library.backend.model.Genero;
import com.library.backend.model.Subgenero;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.*;

import lombok.*;

import java.util.List;

@Data
public class LivroEstanteDTO {

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
    private Integer anoPublicado;

    @NotNull
    @Min(0)
    private int vezesLido;

    @NotNull
    private List<Genero> generos;

    @NotNull
    private List<Subgenero> subgeneros;

}