package com.example.sgra01.entitis;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name = "TbPeriodos")

public class Period {

    @Id
    @Column(name = "IdPeriodo",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Periodo", length = 10, nullable = false)
    private String Period;

    @Column(name = "FechaInicio", nullable = false)
    private LocalDate StartDate;

    @Column(name = "FechaFin", nullable = false)
    private LocalDate EndDate;

    @Column(name = "Estado", nullable = false)
    private Boolean Active = true;

}
