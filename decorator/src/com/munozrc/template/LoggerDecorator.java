package com.munozrc.template;

public class LoggerDecorator implements Logger {

    protected Logger logger; // Object wrapper

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String dataLine) {
        // Default implementation to be overriden by subclasses.
        logger.log(dataLine);
    }

}
