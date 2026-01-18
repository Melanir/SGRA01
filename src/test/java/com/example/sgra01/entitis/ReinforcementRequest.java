package com.example.sgra01.entitis;

import jakarta.persistence.*;

@Entity
@Table(name = "tbsolicitudesrefuerzos")
public class ReinforcementRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsolicitudrefuerzo", nullable = false)
    private Integer idReinforcementRequest;

    @Column(name = "idestudiante", nullable = false)
    private Integer studentId;

    @Column(name = "iddocente", nullable = false)
    private Integer teacherId;

    @Column(name = "idtemario", nullable = false)
    private Integer topicId;

    @Column(name = "idfranjahoraria", nullable = false)
    private Integer timeSlotId;

    @Column(name = "idmodalidad", nullable = false)
    private Integer modalityId;

    @Column(name = "idtiposesion", nullable = false)
    private Integer sessionTypeId;

    @Column(name = "idestadosolicitudrefuerzo", nullable = false)
    private Integer requestStatusId;

    @Column(name = "idperiodo", nullable = false)
    private Integer periodId;

    @Column(name = "diasolicitado", nullable = false)
    private Short requestedDay;

    @Column(name = "motivo", length = 200, nullable = false)
    private String reason;

    @Column(name = "urlarchivo", nullable = false, columnDefinition = "TEXT")
    private String fileUrl;

    public ReinforcementRequest() {
    }

    // getters & setters (igual al patrón anterior)
}
