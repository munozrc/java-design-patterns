package com.munozrc.todo;

public class LinuxPremium implements IPremium {

    private final String name;

    public LinuxPremium(String name) {
        this.name = name;
    }

    @Override
    public String getPremiumName() {
        return name;
    }

    @Override
    public String getPremiumFeatures() {
        return "Linux Premium Features ";
    }

}
