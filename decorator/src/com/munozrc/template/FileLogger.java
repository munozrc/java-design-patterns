package com.munozrc.template;

public class FileLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("Mensaje:\u001B[32m" + msg + "\u001B[0m, grabado en el archivo log.txt");
    }

}
