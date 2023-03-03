package com.munozrc.todo;

public class WindowsPremiumPlus implements IPremiumPlus {

    private final String name;

    public WindowsPremiumPlus(String name) {
        this.name = name;
    }

    @Override
    public String getPremiumPlusName() {
        return name;
    }

    @Override
    public String getPremiumPlusFeatures() {
        return "Windows PremiumPlus features ";
    }

}
