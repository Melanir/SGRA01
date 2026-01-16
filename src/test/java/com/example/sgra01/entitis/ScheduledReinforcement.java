package com.example.sgra01.entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name = "TbRefuerzosProgramados")

public class ScheduledReinforcement {

    @Id
    @Column(name = "IdRefuerzoProgramado", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "IdTipoSesion", nullable = false)
    private Integer SessionTypeId;

    @Column(name = "IdModalidad", nullable = false)
    private Integer ModalityId;

    @Column(name = "TiempoEstimado", nullable = false)
    private LocalTime EstimatedTime;

    @Column(name = "Motivo", length = 200)
    private String Reason;

    @Column (name = "HorarioNuevo")
    private LocalDateTime NewSchedule;

    @Column(name = "Estado", length = 2, nullable = false, columnDefinition = "char(2) default 'P' check (Estado in ('P','RP','R'))")
    private String Status = "P";

}
