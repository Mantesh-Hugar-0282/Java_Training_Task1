package rgt_training_task3;

import java.util.List;

public abstract class Vehicle implements VehicleOperations{

	private String licensePlate;
    private String make; // brand
    private String model;
    private boolean isAvailable;

    public Vehicle(String licensePlate, String make, String model) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.isAvailable = true;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}