package com.library.backend.mapper;

import com.library.backend.dto.LivroDetalheDTO;
import com.library.backend.dto.LivroRequestDTO;
import com.library.backend.dto.LivroResumoDTO;
import com.library.backend.model.Livro;

@Mapper
public class LivroMapper {

    public static Livro livroRequestDTOToLivro(LivroRequestDTO livroRequestDTO) {
        Livro livro = new Livro();
        livro.setTitulo(livroRequestDTO.getTitulo());
        livro.setAutor(livroRequestDTO.getAutor());
        livro.setEditora(livroRequestDTO.getEditora());
        livro.setAno(livroRequestDTO.getAno());
        livro.setDescricao(livroRequestDTO.getDescricao());
        livro.setGeneros(livroRequestDTO.getGeneros());
        livro.setIsbn(livroRequestDTO.getIsbn());
        livro.setPaginas(livroRequestDTO.getPaginas());
        livro.setSubgeneros(livroRequestDTO.getSubgeneros());

        return livro;
    }

    public static LivroResumoDTO livroToLivroResumoDTO(Livro livro) {

        LivroResumoDTO resumoDTO = new LivroResumoDTO();
        resumoDTO.setAutor(livro.getAutor());
        resumoDTO.setTitulo(livro.getTitulo());
        resumoDTO.setEditora(livro.getEditora());
        resumoDTO.setGeneros(livro.getGeneros());
        resumoDTO.setId(livro.getId());

        return resumoDTO;

    }

    public static LivroDetalheDTO livroToLivroDetalheDTO(Livro livro) {
        LivroDetalheDTO detalheDTO = new LivroDetalheDTO();

        detalheDTO.setAutor(livro.getAutor());
        detalheDTO.setTitulo(livro.getTitulo());
        detalheDTO.setEditora(livro.getEditora());
        detalheDTO.setGeneros(livro.getGeneros());
        detalheDTO.setAno(livro.getAno());
        detalheDTO.setIsbn(livro.getIsbn());
        detalheDTO.setPaginas(livro.getPaginas());
        detalheDTO.setDescricao(livro.getDescricao());
        detalheDTO.setSubgeneros(livro.getSubgeneros());
        detalheDTO.setResenha(livro.getResenha());
        detalheDTO.setId(livro.getId());

        return detalheDTO;

    }
}
