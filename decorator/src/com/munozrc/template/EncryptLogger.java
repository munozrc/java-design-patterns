package com.munozrc.template;

public class EncryptLogger extends LoggerDecorator {

    public EncryptLogger(Logger logger) {
        super(logger);
    }

    public void log(String dataLine) {
        // Added functionality
        dataLine = this.encrypt(dataLine);
        // Now forward the encrypted text to the FileLogger for storage
        this.logger.log(dataLine);
    }

    public String encrypt(String dataLine) {
        int length = dataLine.length();
        // Apply simple encryption by Transposition
        // ... Shift all characters by one position
        return dataLine.substring(length - 1) + dataLine.substring(0, length - 1);
    }
}
