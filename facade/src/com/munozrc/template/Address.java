package com.munozrc.template;

public class Address {

    private final String address;
    private final String city;
    private final String state;
    private final String ADDRESS_DATA_FILE = "Address.txt";

    public Address(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public boolean isValid() {
        String parseState = this.state.trim();
        return parseState.length() > 2;
    }

    public boolean save() {
        String dataLine = getAddress() + ", " + getCity() + ", " + getState();
        System.out.println("Grabado el archivo " + ADDRESS_DATA_FILE + " Texto: \u001B[33m" + dataLine + "\u001B[0m");
        return true;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

}
