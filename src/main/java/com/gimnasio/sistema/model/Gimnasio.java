package com.gimnasio.sistema.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "gimnasios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Gimnasio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 150)
    private String direccion;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(name = "fecha_alta", updatable = false)
    private LocalDateTime fechaAlta;

    @PrePersist
    protected void onCreate() {
        this.fechaAlta = LocalDateTime.now();
    }
}
