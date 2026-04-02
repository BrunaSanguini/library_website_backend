package com.library.backend.dto.livro;

import com.library.backend.enums.Status;
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

        private int vezesLido;

        private String idioma;

        private Status status;

        private List<Genero> generos;

        private List<Subgenero> subgeneros;

}
