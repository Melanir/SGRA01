package com.example.sgra01.entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name = "TbDisponibilidadDocente")

public class TeacherAvailability {

    @Id
    @Column(name = "IdDisponibilidadDocente", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "IdDocente", nullable = false)
    private Integer TeacherId;

    @Column(name = "IdFranjaHorario", nullable = false)
    private Integer TimeSlotId;

    @Column(name = "IdPeriodo", nullable = false)
    private Integer PeriodId;

    @Column(name = "DiaSemana", nullable = false)
    private Short DayOfWeek;

    @Column(name = "Estado", nullable = false)
    private Boolean Active = true;

}
