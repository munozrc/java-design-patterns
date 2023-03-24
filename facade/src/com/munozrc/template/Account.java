package com.munozrc.template;

public class Account {

    private final String firstName;
    private final String lastName;
    private final String ACCOUNT_DATA_FILE = "AccountData.txt";

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean isValid() {
        String parseFirstName = this.firstName.trim();
        return !parseFirstName.equals("");
    }

    public boolean save() {
        String dataLine = getLastName() + ", " + getFirstName();
        System.out.println("Grabado el archivo " + ACCOUNT_DATA_FILE + " Texto: \u001B[33m" + dataLine + "\u001B[0m");
        return true;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
