package com.vehicle.rental;

public class RentalTransaction {
	private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }

    
    public String toString() {
        return "RentalTransaction: Customer: " + customer.getName() + ", Vehicle: " + vehicle.getModel() + ", Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost();
    }

}
