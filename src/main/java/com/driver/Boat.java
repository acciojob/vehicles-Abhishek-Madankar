package com.driver;

public class Boat implements WaterVehicle{
    private String vehicleName;
    private int capacity;

    public Boat(String name, int capacity) {
        this.vehicleName = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return this.vehicleName;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
