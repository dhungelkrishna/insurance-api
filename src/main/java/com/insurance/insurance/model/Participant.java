package com.insurance.insurance.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/*
 * 
 * ------------------------------------------------------------
Participant Table:

ParticipantID (Primary Key)
UserID (Foreign Key referencing User Table)
ProgramID (Foreign Key referencing Wellness Program Table)
EnrollmentDate
Status (e.g., active, completed)
------------------------------------------------------------
 */
@Entity
@Table(name="participant")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="participant_id")
    private long participantID;
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    private User user;
    @OneToOne
    @JoinColumn(name="program_id",referencedColumnName = "program_id")
    private WellnessProgram program;
    @Column(name = "enrollment_date")
    private LocalDateTime enrollmentDate;
    @Column(name = "status")
    private String status;
    public Participant() {
    }
    public Participant(long participantID, User user, WellnessProgram program, LocalDateTime enrollmentDate,
            String status) {
        this.participantID = participantID;
        this.user = user;
        this.program = program;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }
    public long getParticipantID() {
        return participantID;
    }
    public void setParticipantID(long participantID) {
        this.participantID = participantID;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public WellnessProgram getProgram() {
        return program;
    }
    public void setProgram(WellnessProgram program) {
        this.program = program;
    }
    public LocalDateTime getEnrollmentDate() {
        return enrollmentDate;
    }
    public void setEnrollmentDate(LocalDateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    

    
}
