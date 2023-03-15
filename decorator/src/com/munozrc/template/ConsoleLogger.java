package com.munozrc.template;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("\u001B[32mpor consola --->\u001B[0m " + msg);
    }

}
