package com.library.backend.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Historico {

    @Id
    private Long id;

    @OneToMany
    private List<Registro> registros;

}
