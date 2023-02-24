package com.factory.app;

import com.factory.core.LoggerFactory;
import com.factory.core.Logger;

public class LoggerTest {

    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        Logger msgLogger = factory.getLogger();

        msgLogger.log("A Message to Log.");
    }
}
