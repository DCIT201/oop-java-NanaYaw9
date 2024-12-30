package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;


public class Customer {
	private String customerId;
    private String name;
    private List<Vehicle> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getRentalHistory() {
        return new ArrayList<>(rentalHistory);
    }

    public void addRental(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

   
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Rentals: " + rentalHistory.size();
    }

}
