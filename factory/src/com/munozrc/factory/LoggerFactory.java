package com.munozrc.factory;

import java.io.InputStream;
import java.util.Properties;

public class LoggerFactory {

    public enum EnvironmentType {
        PRODUCTION,
        DEVELOPMENT,
        UNDEFINED
    }

    public EnvironmentType getExecutionEnvironment() {
        Properties props = new Properties();
        String propsFilePath = "com/munozrc/factory/logger.properties";
        InputStream fileProps = ClassLoader.getSystemResourceAsStream(propsFilePath);

        try {
            props.load(fileProps);
            String env = props.getProperty("ENV");
            return EnvironmentType.valueOf(env);
        } catch (Exception e) {
            System.out.println("Error al leer el arhivo 'logger.properties' o Error al leer propiedad 'ENV'");
            return EnvironmentType.UNDEFINED;
        }
    }

    public Logger getLogger() {

        EnvironmentType env = getExecutionEnvironment();

        if (env == EnvironmentType.DEVELOPMENT) {
            return new FileLogger();
        }

        if (env == EnvironmentType.PRODUCTION) {
            return new DBLogger();
        }

        // Establecemos un Logger por default
        return new ConsoleLogger();
    }
}
