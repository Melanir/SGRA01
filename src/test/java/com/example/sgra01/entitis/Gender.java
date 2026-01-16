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
@Table(name = "TbGeneros")

public class Gender {

    @Id
    @Column(name = "IdGenero",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NombreGenero" ,length = 15, nullable = false)
    private String genderName;

    @Column(name = "Estado", nullable = false)
    private Boolean active = true;

}
