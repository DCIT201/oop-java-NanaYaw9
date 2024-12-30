package com.vehicle.rental;

public class Motorcycle extends Vehicle {
	public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

   
    public boolean isAvailableForRental() {
        return isAvailable();
    }

   
    public String toString() {
        return super.toString();
    }

}
