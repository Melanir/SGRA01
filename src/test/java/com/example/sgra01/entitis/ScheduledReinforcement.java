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
@Table(name = "TbScheduledReinforcement")

public class ScheduledReinforcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer sessionTypeId;

    @Column(nullable = false)
    private Integer modalityId;

    @Column(nullable = false)
    private LocalTime estimatedTime;

    @Column(length = 200)
    private String reason;

    @Column
    private LocalDateTime newSchedule;

    @Column(length = 2, nullable = false, columnDefinition = "char(2) default 'P' check (Estado in ('P','RP','R'))")
    private String status = "P";

}
