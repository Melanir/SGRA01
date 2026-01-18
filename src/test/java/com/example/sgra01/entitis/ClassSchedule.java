package com.example.sgra01.entitis;

import jakarta.persistence.*;

@Entity
@Table(name = "tbhorarioclases")
public class ClassSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhorarioclases", nullable = false)
    private Integer idClassSchedule;

    @Column(name = "idfranjahorario", nullable = false)
    private Integer timeSlotId;

    @Column(name = "idclases", nullable = false)
    private Integer classId;

    @Column(name = "idperiodo", nullable = false)
    private Integer periodId;

    @Column(name = "dia", nullable = false)
    private Short day;

    @Column(name = "estado", nullable = false)
    private Boolean active = true;

    public ClassSchedule() {
    }

    public ClassSchedule(Integer idClassSchedule, Integer timeSlotId, Integer classId, Integer periodId, Short day, Boolean active) {
        this.idClassSchedule = idClassSchedule;
        this.timeSlotId = timeSlotId;
        this.classId = classId;
        this.periodId = periodId;
        this.day = day;
        this.active = active;
    }

    public Integer getIdClassSchedule() {
        return idClassSchedule;
    }

    public void setIdClassSchedule(Integer idClassSchedule) {
        this.idClassSchedule = idClassSchedule;
    }

    public Integer getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(Integer timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Integer periodId) {
        this.periodId = periodId;
    }

    public Short getDay() {
        return day;
    }

    public void setDay(Short day) {
        this.day = day;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
