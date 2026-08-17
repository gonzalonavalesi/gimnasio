package com.gimnasio.sistema.model;

import com.gimnasio.sistema.enums.EstadoSocio;
import com.gimnasio.sistema.enums.Rol;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "usuarios")
@Getter
@Setter

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String apellido;

    @Column(nullable = false,unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,length = 30)
    private Rol rol;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EstadoSocio estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="gimnasio_id",nullable = true)
    private Gimnasio gimnasio;

    @Column(name = "fecha_registro", updatable = false)
    private LocalDateTime fechaRegistro;

    @PrePersist
    protected void onCreate() {
        this.fechaRegistro = LocalDateTime.now();
        if (this.estado == null) {
            this.estado = EstadoSocio.ACTIVO;
        }
    }


}
