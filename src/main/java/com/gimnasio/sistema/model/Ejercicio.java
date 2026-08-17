package com.gimnasio.sistema.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ejercicios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 255)
    private String descripcion;

    @Column(length = 100)
    private String grupoMuscular;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gimnasio_id", nullable = true)
    private Gimnasio gimnasio;
}