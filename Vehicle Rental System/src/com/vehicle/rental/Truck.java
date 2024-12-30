package com.vehicle.rental;

public class Truck extends Vehicle {
	private double loadCapacity; // in tons

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

  
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + 50 * loadCapacity; 
    }

  
    public boolean isAvailableForRental() {
        return isAvailable();
    }

  
    public String toString() {
        return super.toString() + ", Load Capacity: " + loadCapacity + " tons";
    }

}
