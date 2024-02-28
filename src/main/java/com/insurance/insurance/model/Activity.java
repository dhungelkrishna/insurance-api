package com.insurance.insurance.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/*Wellness Activity Table:
ActivityID (Primary Key)
ActivityName
Description
ActivityDate
ParticipantID (Foreign Key referencing Participant Table)
PointsEarned */
@Entity
@Table(name="wellness_activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_id")
    private Long activityID;
    @Column(name="activity_name")
    private String activityName;
    @Column(name = "description")
    private String description;
    @Column(name="activity_date")
    private LocalDateTime activityDate;
    @ManyToOne
    @JoinColumn(name="participant_id", referencedColumnName = "participant_id")
    private Participant participant;
    @Column(name = "points_earned")
    private int pointsEarned;
    public Activity() {
    }
    public Activity(long activityID, String activityName, String description, LocalDateTime activityDate,
            Participant participant, int pointsEarned) {
        this.activityID = activityID;
        this.activityName = activityName;
        this.description = description;
        this.activityDate = activityDate;
        this.participant = participant;
        this.pointsEarned = pointsEarned;
    }
    public long getActivityID() {
        return activityID;
    }
    public void setActivityID(long activityID) {
        this.activityID = activityID;
    }
    public String getActivityName() {
        return activityName;
    }
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDateTime getActivityDate() {
        return activityDate;
    }
    public void setActivityDate(LocalDateTime activityDate) {
        this.activityDate = activityDate;
    }
    public Participant getParticipant() {
        return participant;
    }
    public void setParticipant(Participant participant) {
        this.participant = participant;
    }
    public int getPointsEarned() {
        return pointsEarned;
    }
    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
    
    
}
