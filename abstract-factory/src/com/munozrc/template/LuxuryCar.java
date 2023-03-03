package com.munozrc.template;

public class LuxuryCar implements Car {

    private final String name;

    public LuxuryCar(String cName) {
        name = cName;
    }

    @Override
    public String getCarName() {
        return name;
    }

    @Override
    public String getCarFeatures() {
        return "Luxury Car Features ";
    }

}
