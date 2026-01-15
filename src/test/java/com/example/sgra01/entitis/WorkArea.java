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
@Table(name = "TbWorkArea")

public class WorkArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(length = 25, nullable = false)
    private String WorkArea;

    @Column
    private Integer Capacity;

    @Column(length = 1, nullable = false)
    private String Availability;

}
