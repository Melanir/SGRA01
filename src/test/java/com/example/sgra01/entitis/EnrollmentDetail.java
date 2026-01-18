package com.example.sgra01.entitis;

import jakarta.persistence.*;

@Entity
@Table(name = "tbdetallematricula")
public class EnrollmentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetalle", nullable = false)
    private Integer idEnrollmentDetail;

    @Column(name = "idmatricula", nullable = false)
    private Integer enrollmentId;

    @Column(name = "idasignatura", nullable = false)
    private Integer subjectId;

    @Column(name = "paralelo", nullable = false, length = 5)
    private String section;

    @Column(name = "estado", nullable = false)
    private Boolean active = true;

    public EnrollmentDetail() {
    }

    public EnrollmentDetail(Integer idEnrollmentDetail, Integer enrollmentId, Integer subjectId, String section, Boolean active) {
        this.idEnrollmentDetail = idEnrollmentDetail;
        this.enrollmentId = enrollmentId;
        this.subjectId = subjectId;
        this.section = section;
        this.active = active;
    }

    public Integer getIdEnrollmentDetail() {
        return idEnrollmentDetail;
    }

    public void setIdEnrollmentDetail(Integer idEnrollmentDetail) {
        this.idEnrollmentDetail = idEnrollmentDetail;
    }

    public Integer getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
