package com.library.backend.services;

import com.library.backend.dto.livro.LivroDetalheDTO;
import com.library.backend.dto.livro.LivroRequestDTO;
import com.library.backend.dto.livro.LivroResumoDTO;
import com.library.backend.mapper.livro.LivroMapper;
import com.library.backend.model.Livro;
import com.library.backend.repository.livro.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    private final LivroMapper livroMapper;

    public List<LivroResumoDTO> listar(){

        return livroRepository.findAll()
                .stream()
                .map(livroMapper::toResumoDTO)
                .toList();
    }

    public LivroDetalheDTO buscar(Long id){
        Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return livroMapper.toDetalheDTO(livro);
    }


    public LivroDetalheDTO salvarEstante(LivroRequestDTO livroRequestDTO){

        Livro livro = livroMapper.toEntity(livroRequestDTO);

        if (livroRepository.existsByIsbn(livro.getIsbn())){
            throw new IllegalArgumentException("Já existe um livro com o ISBN: " + livro.getIsbn());
        }

        return livroMapper.toDetalheDTO(livroRepository.save(livro));

    }

    public void deletar(Long id){

        Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        livroRepository.delete(livro);

    }

    public LivroDetalheDTO alterar(Long id, LivroRequestDTO livroRequestDTO){

        if (livroRepository.existsById(id)){
            
        }


    }

    public List<Livro> buscaPorTitulo(String titulo) {
        return livroRepository.findByTitulo(titulo);
    }

    public List<Livro> buscaPorDataPublicacao(LocalDate data) {
        return livroRepository.findByAnoPublicado(data);
    }


}
