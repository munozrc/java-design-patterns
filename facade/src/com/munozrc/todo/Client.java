package com.munozrc.todo;

public class Client {

    private final String fullName;
    private final String ID;
    private final String CLIENT_DATA_FILE = "client.txt";

    public Client(String fullName, String ID) {
        this.fullName = fullName;
        this.ID = ID;
    }

    public boolean isValid() {
        String parseFullName = fullName.trim();
        String parseID = ID.trim();
        return !parseFullName.equals("") && !parseID.equals("");
    }

    public boolean save() {
        String dataLine = this.fullName + ", " + this.ID;
        System.out.println("Grabado el archivo " + CLIENT_DATA_FILE + " Texto: \u001B[33m" + dataLine + "\u001B[0m");
        return true;
    }
}
