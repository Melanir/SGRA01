package com.example.sgra01.entitis;

import jakarta.persistence.*;

@Entity
@Table(name = "tbdetallesrefuerzosprogramadas")
public class ScheduledReinforcementDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetallerefuerzoprogramado", nullable = false)
    private Integer idScheduledReinforcementDetail;

    @Column(name = "idrefuerzoprogramado")
    private Integer scheduledReinforcementId;

    @Column(name = "idsolicitudrefuerzo")
    private Integer reinforcementRequestId;

    @Column(name = "estado", nullable = false)
    private Boolean active = true;

    public ScheduledReinforcementDetail() {
    }

    public ScheduledReinforcementDetail(Integer idScheduledReinforcementDetail, Integer scheduledReinforcementId, Integer reinforcementRequestId, Boolean active) {
        this.idScheduledReinforcementDetail = idScheduledReinforcementDetail;
        this.scheduledReinforcementId = scheduledReinforcementId;
        this.reinforcementRequestId = reinforcementRequestId;
        this.active = active;
    }

    public Integer getIdScheduledReinforcementDetail() {
        return idScheduledReinforcementDetail;
    }

    public void setIdScheduledReinforcementDetail(Integer idScheduledReinforcementDetail) {
        this.idScheduledReinforcementDetail = idScheduledReinforcementDetail;
    }

    public Integer getScheduledReinforcementId() {
        return scheduledReinforcementId;
    }

    public void setScheduledReinforcementId(Integer scheduledReinforcementId) {
        this.scheduledReinforcementId = scheduledReinforcementId;
    }

    public Integer getReinforcementRequestId() {
        return reinforcementRequestId;
    }

    public void setReinforcementRequestId(Integer reinforcementRequestId) {
        this.reinforcementRequestId = reinforcementRequestId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
