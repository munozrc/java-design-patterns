package com.munozrc.template;

public class LuxuryVehicleFactory extends VehicleFactory {

    @Override
    public Car getCar() {
        return new LuxuryCar("L-C");
    }

    @Override
    public SUV getSUV() {
        return new LuxurySUV("L-S");
    }

}
