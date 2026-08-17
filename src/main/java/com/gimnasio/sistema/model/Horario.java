package com.gimnasio.sistema.model;

import jakarta.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;
import lombok.*;

@Entity
@Table(name = "horarios_gimnasio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "dia_semana", nullable = false, length = 10)
    private DayOfWeek diaSemana;

    @Column(name = "hora_apertura")
    private LocalTime horaApertura;

    @Column(name = "hora_cierre")
    private LocalTime horaCierre;

    @Column(nullable = false)
    private Boolean cerrado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gimnasio_id", nullable = false)
    private Gimnasio gimnasio;
}