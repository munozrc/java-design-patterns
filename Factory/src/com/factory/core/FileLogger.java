package com.factory.core;

public class FileLogger implements Logger {
    
    @Override
    public void log(String msg) {
        System.out.println("\u001B[32mFROM FILE_LOGGER:\u001B[0m " + msg);
    }
}
