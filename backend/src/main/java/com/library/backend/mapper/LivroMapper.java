package com.library.backend.mapper;

import com.library.backend.dto.LivroDetalheDTO;
import com.library.backend.dto.LivroRequestDTO;
import com.library.backend.dto.LivroResumoDTO;
import com.library.backend.model.Livro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {

    Livro toEntity(LivroRequestDTO dto);
    LivroResumoDTO toResumoDTO(Livro livro);
    LivroDetalheDTO toDetalheDTO(Livro livro);

}
