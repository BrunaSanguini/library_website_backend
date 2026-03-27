package com.library.backend.dto.livro;

import com.library.backend.model.Genero;
import com.library.backend.model.Subgenero;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class LivroWishDTO {

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
    private List<Genero> generos;

    @NotNull
    private List<Subgenero> subgeneros;
}
