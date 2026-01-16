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
@Table(name = "TbRol")

public class Role {

    @Id
    @Column(name = "IdRol", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Rol", length = 15, nullable = false)
    private String Role;

    @Column(name = "Estado", nullable = false)
    private Boolean Active;

}
