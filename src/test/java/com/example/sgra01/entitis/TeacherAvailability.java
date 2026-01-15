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
@Table(name = "TeacherAvailability")

public class TeacherAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer teacherId;

    @Column(nullable = false)
    private Integer timeSlotId;

    @Column(nullable = false)
    private Integer periodId;

    @Column(nullable = false)
    private Short dayOfWeek;

    @Column(nullable = false)
    private Boolean active = true;

}
