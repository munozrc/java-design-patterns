package com.factory.core;

import java.io.InputStream;
import java.util.Properties;

public class LoggerFactory {
    public boolean isFileLoggingEnabled() {
        Properties props = new Properties();
        String propsFilePath ="com/factory/app/logger.properties";
        InputStream fileProps = ClassLoader.getSystemResourceAsStream(propsFilePath);
        
        try {
            props.load(fileProps);
            String fileLoggingValue = props.getProperty("FileLogging");
            return fileLoggingValue.equalsIgnoreCase("ON") == true;
        } catch (Exception e) {
            System.err.println("Error al leer 'logger.properties': " + e.getMessage());
            return false;
        }
    }
    
    public Logger getLogger() {
        if (isFileLoggingEnabled()) return new FileLogger();
        return new ConsoleLogger();
    }
}
