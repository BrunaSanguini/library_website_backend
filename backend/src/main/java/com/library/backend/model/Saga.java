package com.library.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Saga {

    @Id
    private Long id;

    private String nomeSaga;

    @OneToMany
    private List<Livro> livrosSaga;


}
