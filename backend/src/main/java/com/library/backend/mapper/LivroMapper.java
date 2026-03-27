package com.library.backend.mapper;

import com.library.backend.dto.LivroDetalheDTO;
import com.library.backend.dto.LivroEstanteDTO;
import com.library.backend.dto.LivroResumoDTO;
import com.library.backend.dto.LivroWishDTO;
import com.library.backend.model.Livro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {

    Livro toEntity(LivroEstanteDTO dto);
    Livro toEntity(LivroWishDTO dto);
    LivroResumoDTO toResumoDTO(Livro livro);
    LivroDetalheDTO toDetalheDTO(Livro livro);

}
