package com.library.backend.dto.livro;

import com.library.backend.enums.Status;
import com.library.backend.model.Genero;
import com.library.backend.model.Subgenero;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;

import lombok.*;

import java.util.List;

@Data
public class LivroRequestDTO {

    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @NotBlank
    private String editora;

    @NotBlank
    @Size(min = 10, max = 13)
    private String isbn;

    @NotNull
    @Min(1)
    private Integer paginas;

    @NotNull
    private Integer anoPublicado;

    @NotBlank
    private String sinopse;

    @NotBlank
    private String idioma;

    @NotNull
    private Status status;

    @NotNull
    private List<Genero> generos;

    @NotNull
    private List<Subgenero> subgeneros;

}