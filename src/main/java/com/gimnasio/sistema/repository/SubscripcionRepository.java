package com.gimnasio.sistema.repository;

import com.gimnasio.sistema.model.Subscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubscripcionRepository extends JpaRepository<Subscripcion, Long> {
    List<Subscripcion> findByUsuarioId(Long usuarioId);

    Optional<Subscripcion> findByMercadoPagoPaymentId(String paymentId);

    List<Subscripcion> findByUsuarioGimnasioIdAndActivaTrue(Long gimnasioId);
}