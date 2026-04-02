package com.library.backend.dto.livro;

import com.library.backend.enums.Status;
import lombok.*;

@Data
public class LivroResumoDTO {

    private Long id;

    private String titulo;

    private String autor;

    private Status status;

}
