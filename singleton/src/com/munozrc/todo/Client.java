package com.munozrc.todo;

public class Client {

    public static void main(String[] args) {

        DBConnection conn = DBConnection.getDBConnection();
        conn.connect("Empleados");
        conn.disconnect();

        DBConnection conn2 = DBConnection.getDBConnection();
        conn2.connect("Nomina");
        conn2.disconnect();

        boolean isSameInstance = conn == conn2;

        if (isSameInstance) {
            System.out.println("They are the same instance.");
        } else {
            System.out.println("They are NOT the same instance");
        }

    }
}
