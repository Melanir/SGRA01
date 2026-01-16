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
@Table(name = "TbAreasTrabajos")

public class WorkArea {

    @Id
    @Column(name = "IdAreasTrabajos", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "AreaTrabajo", length = 25, nullable = false)
    private String WorkArea;

    @Column (name = "Cpacidad")
    private Integer Capacity;

    @Column(name = "Disponibilidad", length = 1, nullable = false)
    private String Availability;

}
