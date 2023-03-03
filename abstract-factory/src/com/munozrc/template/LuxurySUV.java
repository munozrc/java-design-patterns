package com.munozrc.template;

public class LuxurySUV implements SUV {

    private final String name;

    public LuxurySUV(String sName) {
        name = sName;
    }

    @Override
    public String getSUVName() {
        return name;
    }

    @Override
    public String getSUVFeatures() {
        return "Luxury SUV Features ";
    }

}
