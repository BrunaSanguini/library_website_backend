package com.library.backend.dto;

import com.library.backend.model.Genero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivroResumoDTO {

    private Long id;

    private String titulo;

    private String autor;

    private String editora;

    private Set<Genero> generos;

}
