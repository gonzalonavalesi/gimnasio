package com.gimnasio.sistema.repository;

import com.gimnasio.sistema.model.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {
    List<Asistencia> findByUsuarioId(Long usuarioId);

    List<Asistencia> findByGimnasioId(Long gimnasioId);
}