package com.library.backend.mapper;

import com.library.backend.dto.livro.LivroDetalheDTO;
import com.library.backend.dto.livro.LivroEstanteDTO;
import com.library.backend.dto.livro.LivroResumoDTO;
import com.library.backend.dto.livro.LivroWishDTO;
import com.library.backend.model.Livro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {

    Livro toEntity(LivroEstanteDTO dto);
    Livro toEntity(LivroWishDTO dto);
    LivroResumoDTO toResumoDTO(Livro livro);
    LivroDetalheDTO toDetalheDTO(Livro livro);

}
