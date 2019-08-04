package com.company.data;

public class Plane extends AbstractVehicle implements VehicleTypeAware {

    public Plane() {
    }

    public Plane(Long id, String name) {
        super(id, name);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.PLANE;
    }
}
