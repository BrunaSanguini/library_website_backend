package com.library.backend.dto;

import com.library.backend.model.Genero;
import com.library.backend.model.Subgenero;
import lombok.*;

import java.util.List;



@Data
public class LivroDetalheDTO {

        private Long id;

        private String titulo;

        private String autor;

        private String editora;

        private String isbn;

        private Integer paginas;

        private Integer anoPublicado;

        private String sinopse;

        private List<Genero> generos;

        private List<Subgenero> subgeneros;

}
