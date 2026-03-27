package com.library.backend.services;

import com.library.backend.dto.LivroDetalheDTO;
import com.library.backend.dto.LivroEstanteDTO;
import com.library.backend.dto.LivroWishDTO;
import com.library.backend.mapper.LivroMapper;
import com.library.backend.model.Livro;
import com.library.backend.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    private final LivroMapper livroMapper;


    public LivroDetalheDTO salvarEstante(LivroEstanteDTO livroEstanteDTO){

        Livro livro = livroMapper.toEntity(livroEstanteDTO);

        if (livroRepository.existsByIsbn(livro.getIsbn())){
            throw new IllegalArgumentException("Já existe um livro com o ISBN: " + livro.getIsbn());
        }

        return livroMapper.toDetalheDTO(livroRepository.save(livro));

    }

    public LivroDetalheDTO salvarWish(LivroWishDTO livroWishDTO){

        Livro livro = livroMapper.toEntity(livroWishDTO);

        if (livroRepository.existsByIsbn(livro.getIsbn())){
            throw new IllegalArgumentException("Já existe um livro com o ISBN: " + livro.getIsbn());
        }

        return livroMapper.toDetalheDTO(livroRepository.save(livro));

    }

    public void deletar(Long id){}

    public void alterar(Long id, LivroEstanteDTO livroRequestDTO){}


}
