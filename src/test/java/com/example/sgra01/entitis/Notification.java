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
@Table(name = "TbNotification")

public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private Integer IdUser;

    @Column(length = 100, nullable = false)
    private String Title;

    @Column(length = 100, nullable = false)
    private String Message;

    @Column(nullable = false)
    private LocalDateTime DateSent;

}
