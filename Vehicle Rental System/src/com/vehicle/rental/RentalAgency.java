package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
	private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> available = new ArrayList<>();
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailableForRental()) {
                available.add(vehicle);
            }
        }
        return available;
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
        if (!vehicle.isAvailableForRental()) {
            System.out.println("Vehicle is not available for rental.");
            return;
        }
        vehicle.setAvailable(false);
        RentalTransaction transaction = new RentalTransaction(vehicle, customer, days);
        transactions.add(transaction);
        customer.addRental(vehicle);
        System.out.println("Rental successful: " + transaction);
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        System.out.println("Vehicle returned: " + vehicle.getModel());
    }

    
    public String toString() {
        return "RentalAgency: Fleet size: " + fleet.size() + ", Transactions: " + transactions.size();
    }

}
