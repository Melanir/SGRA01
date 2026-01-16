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
@Table(name = "TbInstitutiones")

public class Institution {

    @Id
    @Column(name = "IdInstituciones", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "NombreInstitucion", nullable = false)
    private String InstitutionName;

    @Column(name= "Estado", nullable = false)
    private Boolean Active = true;

}

