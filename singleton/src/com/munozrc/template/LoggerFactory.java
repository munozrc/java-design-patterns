package com.munozrc.template;

import java.io.InputStream;
import java.util.Properties;

public class LoggerFactory {

    public boolean isFileLoggingEnabled() {

        Properties props = new Properties();
        String propsFilePath = "com/munozrc/template/logger.properties";
        InputStream fileProps = ClassLoader.getSystemResourceAsStream(propsFilePath);

        try {
            props.load(fileProps);
            String fileLogginValue = props.getProperty("FileLogging");
            return fileLogginValue.equalsIgnoreCase("ON");
        } catch (Exception e) {
            System.out.println("Error al leer el arhivo 'logger.properties' o Error al leer propiedad 'ENV'");
            return false;
        }

    }

    public Logger getLogger() {

        if (isFileLoggingEnabled()) {
            return FileLogger.getFileLogger();
        }

        return new ConsoleLogger();

    }

}
