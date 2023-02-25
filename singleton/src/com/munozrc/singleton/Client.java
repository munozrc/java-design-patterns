package com.munozrc.singleton;

public class Client {

    public static void main(String[] args) {

        DBConnection conn = DBConnection.getDBConnection();
        conn.connect("Empleados");
        conn.disconnect();

        DBConnection conn2 = DBConnection.getDBConnection();
        conn2.connect("Nomina");
        conn2.disconnect();

    }
}
