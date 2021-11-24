package com.farmerproj.farmerdetails.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Farm {
    @Id
    private int farmId;
    private String location;
    private double farmSize;

    public Farm(int farmId, String location, double farmSize) {
        this.farmId = farmId;
        this.location = location;
        this.farmSize = farmSize;
    }

    public Farm() {
    }

    public int getFarmId() {
        return farmId;
    }

    public void setFarmId(int farmId) {
        this.farmId = farmId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getFarmSize() {
        return farmSize;
    }

    public void setFarmSize(double farmSize) {
        this.farmSize = farmSize;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmId=" + farmId +
                ", location='" + location + '\'' +
                ", farmSize=" + farmSize +
                '}';
    }
}
