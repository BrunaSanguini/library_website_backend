package com.library.backend.dto;

import com.library.backend.model.Genero;
import com.library.backend.model.Subgenero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivroDetalheDTO {

        private Long id;

        private String titulo;

        private String autor;

        private String editora;

        private String isbn;

        private Integer paginas;

        private Integer ano;

        private String descricao;

        private String resenha;

        private Set<Genero> generos;

        private Set<Subgenero> subgeneros;

}
