package com.munozrc.todo;

public class LinuxPremiumPlus implements IPremiumPlus {

    private final String name;

    public LinuxPremiumPlus(String name) {
        this.name = name;
    }

    @Override
    public String getPremiumPlusName() {
        return name;
    }

    @Override
    public String getPremiumPlusFeatures() {
        return "Linux PremiumPlus features ";
    }

}
