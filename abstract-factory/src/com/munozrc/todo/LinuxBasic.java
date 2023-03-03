package com.munozrc.todo;

public class LinuxBasic implements IBasic {

    private final String name;

    public LinuxBasic(String name) {
        this.name = name;
    }

    @Override
    public String getBasicName() {
        return name;
    }

    @Override
    public String getBasicFeatures() {
        return "Linux Basic features ";
    }

}
