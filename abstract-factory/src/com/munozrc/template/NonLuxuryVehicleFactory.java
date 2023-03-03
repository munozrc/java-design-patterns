package com.munozrc.template;

public class NonLuxuryVehicleFactory extends VehicleFactory {

    @Override
    public Car getCar() {
        return new NonLuxuryCar("NL-C");
    }

    @Override
    public SUV getSUV() {
        return new NonLuxurySUV("NL-S");
    }

}
