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
@Table(name = "TbModalidad")

public class Modality {

    @Id
    @Column(name = "IdGenero",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Modalidad", length = 15, nullable = false)
    private String Modality;

    @Column(name = "Estado", nullable = false)
    private Boolean Active = true;

}
