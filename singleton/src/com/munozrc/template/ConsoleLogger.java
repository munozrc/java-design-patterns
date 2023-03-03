package com.munozrc.template;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("\u001B[32mFROM CONSOLE_LOGGER:\u001B[0m " + msg);
    }

}
