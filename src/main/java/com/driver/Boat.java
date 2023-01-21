package com.driver;

public class Boat implements WaterVehicle {
    String name;
    int capacity;

    public Boat(String name, int capacity) {
        this.capacity = capacity;
        this.name = name;
    }


    public String getVehicleName() {
        return this.name;
    }


    public int getVehicleCapacity() {
        return this.capacity;
    }
}
