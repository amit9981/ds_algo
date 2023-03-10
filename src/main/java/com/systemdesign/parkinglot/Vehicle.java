package com.systemdesign.parkinglot;

import lombok.Data;

@Data
public class Vehicle {
    private int vehicleNo;
    private VehicleType vehicleType;
    private ParkingSpot parkingSpot;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
