package com.example.sgra01.entitis;

import jakarta.persistence.*;

@Entity
@Table(name = "tbclases")
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idclase", nullable = false)
    private Integer idClass;

    @Column(name = "iddocente", nullable = false)
    private Integer teacherId;

    @Column(name = "idasignatura", nullable = false)
    private Integer subjectId;

    @Column(name = "idperiodo", nullable = false)
    private Integer periodId;

    @Column(name = "estado", nullable = false)
    private Boolean active = true;

    public ClassEntity() {
    }

    public ClassEntity(Integer idClass, Integer teacherId, Integer subjectId, Integer periodId, Boolean active) {
        this.idClass = idClass;
        this.teacherId = teacherId;
        this.subjectId = subjectId;
        this.periodId = periodId;
        this.active = active;
    }

    public Integer getIdClass() {
        return idClass;
    }

    public void setIdClass(Integer idClass) {
        this.idClass = idClass;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Integer periodId) {
        this.periodId = periodId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
