package com.munozrc.factory;

public class LoggerTest {

    public static void main(String[] args) {

        LoggerFactory factory = new LoggerFactory();
        Logger msgLogger = factory.getLogger();

        msgLogger.log("A Message to Log.");

    }

}
