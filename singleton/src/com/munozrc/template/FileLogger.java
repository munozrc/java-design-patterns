package com.munozrc.template;

public class FileLogger implements Logger {

    private static FileLogger logger;

    public FileLogger() {
    }

    public static FileLogger getFileLogger() {

        if (logger == null) {
            logger = new FileLogger();
        }

        return logger;
    }

    @Override
    public void log(String msg) {
        System.out.println("\u001B[32mFROM FILE_LOGGER:\u001B[0m " + msg);
    }

}
