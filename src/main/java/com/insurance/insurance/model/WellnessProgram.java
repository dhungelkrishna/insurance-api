package com.insurance.insurance.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * ------------------------------------------------------------
Wellness Program Table:
ProgramID (Primary Key)
ProgramName
Description
StartDate
EndDate
------------------------------------------------------------
 */
@Entity
@Table(name="program")
public class WellnessProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="program_id")
    private long programID;
    @Column(name="program_name")
    private String programName;
    @Column(name="description")
    private String description;
    @Column(name="start_date")
    private LocalDateTime startDate;
    @Column(name="end_date")
    private LocalDateTime endDate;
    public WellnessProgram() {
    }
    public WellnessProgram(long programID, String programName, String description, LocalDateTime startDate,
            LocalDateTime endDate) {
        this.programID = programID;
        this.programName = programName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public long getProgramID() {
        return programID;
    }
    public void setProgramID(long programID) {
        this.programID = programID;
    }
    public String getProgramName() {
        return programName;
    }
    public void setProgramName(String programName) {
        this.programName = programName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    } 
}
