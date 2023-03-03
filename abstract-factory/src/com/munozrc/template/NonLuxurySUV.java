package com.munozrc.template;

public class NonLuxurySUV implements SUV {

    private final String name;

    public NonLuxurySUV(String sName) {
        name = sName;
    }

    @Override
    public String getSUVName() {
        return name;
    }

    @Override
    public String getSUVFeatures() {
        return "Non-Luxury SUV Features ";
    }

}
