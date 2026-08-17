package com.gimnasio.sistema.repository;

import com.gimnasio.sistema.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findByDni(String dni);

    Boolean existsByEmail(String email);

    Boolean existsByDni(String dni);

    List<Usuario> findByGimnasioId(Long gimnasioId);
}