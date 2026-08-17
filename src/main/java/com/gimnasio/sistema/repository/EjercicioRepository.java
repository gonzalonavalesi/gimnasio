package com.gimnasio.sistema.repository;

import com.gimnasio.sistema.model.Ejercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EjercicioRepository extends JpaRepository<Ejercicio, Long> {
    List<Ejercicio> findByGimnasioIdOrGimnasioIsNull(Long gimnasioId);
}