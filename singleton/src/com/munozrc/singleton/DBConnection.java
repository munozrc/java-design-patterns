package com.munozrc.singleton;

public class DBConnection {

    private static DBConnection conn;

    private DBConnection() {
        System.out.println("---> Instantiated class.");
    }

    public static DBConnection getDBConnection() {

        boolean checkExistsConnection = conn == null;

        if (checkExistsConnection) {
            conn = new DBConnection();
        }

        return conn;
    }

    public void connect(String dbName) {
        System.out.println("Connected to \u001B[33m" + dbName + "\u001B[0m");
    }

    public void disconnect() {
        conn = null;
        System.out.println("Successful disconnection.\n");
    }
}
