package com.library.backend.dto.registro;

import com.library.backend.model.Historico;
import com.library.backend.model.Livro;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RegistroRequestDTO {

    @NotNull
    private Historico historico;

    @Past
    private LocalDate inicioLeitura;

    @PastOrPresent
    private LocalDate fimLeitura;

    @NotNull
    private Livro livroLido;

    @NotBlank
    private String resenha;

    @NotNull
    @DecimalMax("5")
    @DecimalMin("0")
    private Double estrelas;

}
