package com.munozrc.template;

public class Client {

    public static void main(String[] args) {

        LoggerFactory factory = new LoggerFactory();

        Logger logger = factory.getLogger();
        Logger logger2 = factory.getLogger();

        HTMLLogger html = new HTMLLogger(logger);
        EncryptLogger encrypt = new EncryptLogger(logger2);

        // The decorator object provides the same interface "Logger"
        html.log("A Message to Log.");
        encrypt.log("A Message to Log.");

    }

}
