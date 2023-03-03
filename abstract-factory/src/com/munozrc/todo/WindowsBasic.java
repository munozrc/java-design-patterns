package com.munozrc.todo;

public class WindowsBasic implements IBasic {

    private final String name;

    public WindowsBasic(String name) {
        this.name = name;
    }

    @Override
    public String getBasicName() {
        return name;
    }

    @Override
    public String getBasicFeatures() {
        return "Windows Basic features ";
    }
}
