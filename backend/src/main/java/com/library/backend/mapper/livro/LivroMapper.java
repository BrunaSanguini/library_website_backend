package com.library.backend.mapper.livro;

import com.library.backend.dto.livro.LivroDetalheDTO;
import com.library.backend.dto.livro.LivroRequestDTO;
import com.library.backend.dto.livro.LivroResumoDTO;
import com.library.backend.model.Livro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {

    Livro toEntity(LivroRequestDTO dto);

    LivroResumoDTO toResumoDTO(Livro livro);

    LivroDetalheDTO toDetalheDTO(Livro livro);

}
