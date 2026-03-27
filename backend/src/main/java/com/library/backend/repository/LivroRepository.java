package com.library.backend.repository;

import com.library.backend.model.Livro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    boolean existsByIsbn(@NotBlank @Size(min = 10, max = 13) String isbn);

}