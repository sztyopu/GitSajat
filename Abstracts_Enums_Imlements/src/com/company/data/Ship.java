package com.company.data;

public class Ship extends AbstractVehicle implements VehicleTypeAware {

    public Ship() {
    }


    public Ship(Long id, String name) {
        super(id, name);

    }

    @Override
    public VehicleType getType() {
        return VehicleType.SHIP;
    }
}
