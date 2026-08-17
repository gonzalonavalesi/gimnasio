package com.gimnasio.sistema.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double monto;

    @Column(name = "fecha_pago", nullable = false, updatable = false)
    private LocalDateTime fechaPago;

    @Column(name = "medio_pago", length = 50, nullable = false)
    private String medioPago;

    @Column(name = "comprobante_id", length = 100)
    private String comprobanteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subscripcion_id", nullable = true)
    private Subscripcion subscripcion;
    @PrePersist
    protected void onCreate() {
        this.fechaPago = LocalDateTime.now();
    }
}