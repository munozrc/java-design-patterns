package com.munozrc.template;

public class ClientMain {

    public static void main(String[] args) {

        String vehicleCategory = "Non-Luxury"; // Luxury or Non-Luxury
        String vehicleType = "Car"; // Suv or Car
        String searchResult = "";

        VehicleFactory vehicle = VehicleFactory.getVehicleFactory(vehicleCategory);

        if (vehicleType.equals("Car")) {
            Car c = vehicle.getCar();
            searchResult = "Name: " + c.getCarName() + " Features: " + c.getCarFeatures();
        }

        if (vehicleType.equals("Suv")) {
            SUV s = vehicle.getSUV();
            searchResult = "Name: " + s.getSUVName() + " Features: " + s.getSUVFeatures();
        }

        System.out.println(searchResult);

    }

}
