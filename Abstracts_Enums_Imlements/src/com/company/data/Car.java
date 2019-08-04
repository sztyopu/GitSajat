package com.company.data;

public class Car extends AbstractVehicle implements VehicleTypeAware{

    private int doorNumbers;
    public Car() {
    }

    public Car(Long id, String name, int doorNumbers) {
        super(id, name);
        this.doorNumbers = doorNumbers;
    }

    public int getDoorNumbers() {
        return doorNumbers;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumbers = doorNumber;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
