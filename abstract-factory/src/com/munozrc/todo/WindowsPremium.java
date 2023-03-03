package com.munozrc.todo;

public class WindowsPremium implements IPremium {

    private final String name;

    public WindowsPremium(String name) {
        this.name = name;
    }

    @Override
    public String getPremiumName() {
        return name;
    }

    @Override
    public String getPremiumFeatures() {
        return "Windows Premium Features ";
    }

}
