package com.factory.core;

public class DBLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("\u001B[32mFROM DB_LOGGER:\u001B[0m " + msg);
    }

}
