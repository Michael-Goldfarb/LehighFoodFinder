package com.pp.backend.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RathboneRatingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int givenStars;
    private int totalGivenStars;
    private int totalMaxStars;
    private double averageStars;

    public RathboneRatingRequest() {
    }

    public RathboneRatingRequest(Long id, int givenStars, int totalGivenStars, int totalMaxStars, double averageStars) {
        this.id = id;
        this.givenStars = givenStars;
        this.totalGivenStars = totalGivenStars;
        this.totalMaxStars = totalMaxStars;
        this.averageStars = averageStars;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGivenStars() {
        return givenStars;
    }

    public void setGivenStars(int givenStars) {
        this.givenStars = givenStars;
    }

    public int getTotalGivenStars() {
        return totalGivenStars;
    }

    public void setTotalGivenStars(int totalGivenStars) {
        this.totalGivenStars = totalGivenStars;
    }

    public int getTotalMaxStars() {
        return totalMaxStars;
    }

    public void setTotalMaxStars(int totalMaxStars) {
        this.totalMaxStars = totalMaxStars;
    }

    public double getAverageStars() {
        return averageStars;
    }

    public void setAverageStars(double averageStars) {
        this.averageStars = averageStars;
    }
}