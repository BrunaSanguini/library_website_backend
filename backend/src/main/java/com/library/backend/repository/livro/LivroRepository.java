package com.library.backend.repository.livro;

import com.library.backend.model.Livro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    boolean existsByIsbn(@NotBlank @Size(min = 10, max = 13) String isbn);

    List<Livro> findByIsbn(@NotBlank @Size(min = 10) String isbn);

    List<Livro> findByTitulo(@NotBlank String titulo);

    List<Livro> findByAutor(@NotBlank String autor);

    List<Livro> findByEditora(@NotBlank String editora);

    List<Livro> findByAnoPublicado(LocalDate anoPublicado);

    List<Livro> findByAnoPublicacaoAfter(@NotBlank String anoPublicacao);
}