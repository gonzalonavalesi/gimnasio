package com.gimnasio.sistema.repository;

import com.gimnasio.sistema.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByUsuarioId(Long usuarioId);

    List<Pago> findBySuscripcionId(Long suscripcionId);
}