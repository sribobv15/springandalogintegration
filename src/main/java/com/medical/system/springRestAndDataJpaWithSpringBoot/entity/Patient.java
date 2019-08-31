package com.medical.system.springRestAndDataJpaWithSpringBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="PATIENT")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getSampleid() {
        return sampleid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setSampleid(String sampleid) {
        this.sampleid = sampleid;
    }

    @Column(name = "SAMPLEID")
    private String sampleid;

    @Column(name = "DATE")
    private String date;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public int getNeocolbm1() {
        return neocolbm1;
    }

    public void setNeocolbm1(int neocolbm1) {
        this.neocolbm1 = neocolbm1;
    }

    @Column(name = "PATIENTID")
    private String patientid;

    @Column(name = "AGE")
    private int age;

    @Column(name = "DOCTORNAME")
    private String doctorname;

    @Column(name = "NEOCOLBM1")
    private int neocolbm1;

    @Column(name = "NEOCOLBM2")
    private int neocolbm2;

    @Column(name = "NEOCOLBM3")
    private int neocolbm3;

    public int getNeocolbm2() {
        return neocolbm2;
    }

    public void setNeocolbm2(int neocolbm2) {
        this.neocolbm2 = neocolbm2;
    }

    public int getNeocolbm3() {
        return neocolbm3;
    }

    public void setNeocolbm3(int neocolbm3) {
        this.neocolbm3 = neocolbm3;
    }

    public int getNeocolbm4() {
        return neocolbm4;
    }

    public void setNeocolbm4(int neocolbm4) {
        this.neocolbm4 = neocolbm4;
    }

    public int getNeocolbm5() {
        return neocolbm5;
    }

    public void setNeocolbm5(int neocolbm5) {
        this.neocolbm5 = neocolbm5;
    }

    public int getNeocolbm6() {
        return neocolbm6;
    }

    public void setNeocolbm6(int neocolbm6) {
        this.neocolbm6 = neocolbm6;
    }

    @Column(name = "NEOCOLBM4")
    private int neocolbm4;

    @Column(name = "NEOCOLBM5")
    private int neocolbm5;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name = "NEOCOLBM6")
    private int neocolbm6;

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Column(name = "APPROVED")
    private boolean approved;

    @Column(name = "REMARKS")
    private String remarks;

}