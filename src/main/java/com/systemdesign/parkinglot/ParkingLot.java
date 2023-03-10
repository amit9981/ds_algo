package com.systemdesign.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<CompactSpot> compactSpotList = new ArrayList<>();
    List<LargeSpot> largeSpotsList = new ArrayList<>();
    List<BikeSpot> bikeSpotList = new ArrayList<>();
    int freeCompactSpots;
    int freeLargeSpots;
    int freeBikeSpots;

    public ParkingLot(int freeCompactSpots, int freeLargeSpots, int freeBikeSpots) {
        this.freeCompactSpots = freeCompactSpots;
        this.freeLargeSpots = freeLargeSpots;
        this.freeBikeSpots = freeBikeSpots;
    }

    public void parkVehicle(Vehicle vehicle) {
        System.out.println("park vehicle " + vehicle.getVehicleType());
        if (vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
            if (freeLargeSpots > 0) {
                parkYourLargeVehicle(vehicle);
            } else {
                System.out.println(" No space available");
            }
        } else if (vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if (freeCompactSpots > 0) {
                parkYourCompactVehicle(vehicle);
            } else if (freeLargeSpots > 0) {
                parkYourLargeVehicle(vehicle);
            } else {
                System.out.println("No space available");
            }

        } else if (vehicle.getVehicleType().equals(VehicleType.BIKE)) {
            if (freeBikeSpots > 0) {
                parkYourBikeVehicle(vehicle);
            } else if (freeCompactSpots > 0) {
                parkYourCompactVehicle(vehicle);
            } else if (freeLargeSpots > 0) {
                parkYourLargeVehicle(vehicle);
            } else {
                System.out.println("No space available");
            }
        }

    }

    void parkYourLargeVehicle(Vehicle vehicle) {
        LargeSpot largeSpot = new LargeSpot(ParkingSpotType.LARGE);
        largeSpot.setFree(false);
        largeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(largeSpot);
        largeSpotsList.add(largeSpot);
        System.out.println("park success");
        freeLargeSpots--;
    }

    void parkYourCompactVehicle(Vehicle vehicle) {
        CompactSpot compactSpot = new CompactSpot(ParkingSpotType.LARGE);
        compactSpot.setFree(false);
        compactSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(compactSpot);
        compactSpotList.add(compactSpot);
        System.out.println("park success");
        freeCompactSpots--;
    }

    void parkYourBikeVehicle(Vehicle vehicle) {
        BikeSpot bikeSpot = new BikeSpot(ParkingSpotType.BIKE);
        bikeSpot.setFree(false);
        bikeSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeSpot);
        bikeSpotList.add(bikeSpot);
        System.out.println("park success");
        freeBikeSpots--;
    }

    ////unpark
    public void unParkVehicle(Vehicle vehicle) {
        System.out.println("unpark vehicle " + vehicle.getVehicleType());

        ParkingSpot parkingSpot = vehicle.getParkingSpot();
        if (vehicle.getVehicleType().equals(VehicleType.TRUCK)) {
            if (largeSpotsList.remove(parkingSpot)) {
                System.out.println(" we have successfully un park ");
                freeLargeSpots++;
            } else {
                System.out.println(" you dont have vehicle park here ");
            }
        } else if (vehicle.getVehicleType().equals(VehicleType.CAR)) {
            if (compactSpotList.remove(parkingSpot)) {
                System.out.println(" we have successfully un park ");

                freeCompactSpots++;
            } else {
                System.out.println(" you dont have vehicle park here ");
            }

        } else if (vehicle.getVehicleType().equals(VehicleType.BIKE)) {
            if (bikeSpotList.remove(parkingSpot)) {
                System.out.println(" we have successfully un park ");

                freeBikeSpots++;
            } else {
                System.out.println(" you dont have vehicle park here ");
            }
        }

    }
}
