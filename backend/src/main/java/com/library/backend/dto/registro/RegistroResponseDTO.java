package com.library.backend.dto.registro;

import com.library.backend.model.Historico;
import com.library.backend.model.Livro;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class RegistroResponseDTO {

    private LocalDate inicioLeitura;

    private LocalDate fimLeitura;

    private Livro livroLido;

    private String resenha;

    private Double estrelas;
}
