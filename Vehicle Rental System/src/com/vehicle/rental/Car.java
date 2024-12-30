

package com.vehicle.rental;

public class Car extends Vehicle{
	 private boolean hasNavigation;

	    public Car(String vehicleId, String model, double baseRentalRate, boolean hasNavigation) {
	        super(vehicleId, model, baseRentalRate);
	        this.hasNavigation = hasNavigation;
	    }

	    @Override
	    public double calculateRentalCost(int days) {
	        double cost = getBaseRentalRate() * days;
	        if (hasNavigation) {
	            cost += 10 * days; // Additional cost for navigation
	        }
	        return cost;
	    }

	    @Override
	    public boolean isAvailableForRental() {
	        return isAvailable();
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Navigation: " + (hasNavigation ? "Yes" : "No");
	    }

}
