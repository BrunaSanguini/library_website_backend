package com.library.backend.repository.usuario;

import com.library.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class UsuarioRepository implements JpaRepository<Usuario, Long> {

}
