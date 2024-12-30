package com.vehicle.rental;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
        RentalAgency rentalAgency = new RentalAgency();

       
        Car car1 = new Car("C001", "Toyota Corolla", 50, true); 
        Car car2 = new Car("C002", "Honda Civic", 45, false);   
        Motorcycle bike1 = new Motorcycle("M001", "Yamaha R1", 30);
        Truck truck1 = new Truck("T001", "Ford F-150", 80, 5.0); 

        
        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(car2);
        rentalAgency.addVehicle(bike1);
        rentalAgency.addVehicle(truck1);

        
        Customer customer1 = new Customer("CU001", "John Doe");

        
        System.out.println("Available Vehicles:");
        List<Vehicle> availableVehicles = rentalAgency.getAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle);
        }

        
        System.out.println("\nRenting a car...");
        rentalAgency.rentVehicle(customer1, car1, 3);


        System.out.println("\nAvailable Vehicles After Renting:");
        availableVehicles = rentalAgency.getAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle);
        }

        
        System.out.println("\nReturning the car...");
        rentalAgency.returnVehicle(car1);

       
        System.out.println("\nAvailable Vehicles After Returning:");
        availableVehicles = rentalAgency.getAvailableVehicles();
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle);
        }

	}

}
