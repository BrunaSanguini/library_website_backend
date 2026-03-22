package com.library.backend.dto;

import com.library.backend.model.Genero;
import com.library.backend.model.Subgenero;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivroRequestDTO {


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

    private String descricao;

    private Set<Genero> generos;

    private Set<Subgenero> subgeneros;

}