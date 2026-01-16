package com.example.sgra01.entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name = "TbNotificacion")

public class Notification {

    @Id
    @Column(name = "IdNotificacion", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "IdUsuario", nullable = false)
    private Integer IdUser;

    @Column(name = "Titulo", length = 100, nullable = false)
    private String Title;

    @Column(name = "Mensaje", length = 100, nullable = false)
    private String Message;

    @Column(name = "FechaEnvio", nullable = false)
    private LocalDateTime DateSent;

}
