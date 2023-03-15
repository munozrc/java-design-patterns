package com.munozrc.template;

public class HTMLLogger extends LoggerDecorator {

    public HTMLLogger(Logger logger) {
        super(logger);
    }

    public void log(String dataLine) {
        // Added functionality
        dataLine = this.makeHTML(dataLine);
        // Now forward the encrypted text to the FileLogger for storage
        this.logger.log(dataLine);
    }

    public String makeHTML(String dataLine) {
        return "<html>" + dataLine + "</html>";
    }

}
