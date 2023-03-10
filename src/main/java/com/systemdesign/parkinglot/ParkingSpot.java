package com.systemdesign.parkinglot;

import lombok.Data;

@Data
public class ParkingSpot {
    private ParkingSpotType type;
    private Vehicle vehicle;
    private Boolean free;

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }
}
