package com.munozrc.template;

public class AccountManager {

    public static void main(String[] args) {

        CustomerFacade cf = new CustomerFacade();

        cf.setAddress("Direccion 1");
        cf.setCardExpDate("2013-7");
        cf.setCardNumber("8384734234523456");
        cf.setCardType("VISA");
        cf.setCity("Bogota");
        cf.setFirstName("Juan");
        cf.setLastName("Perez");
        cf.setState("Cundinamarca");

        if (cf.saveCustomerData()) {
            System.out.println("Datos grabados con éxito!");
        } else {
            System.out.println("No se pudo grabar.");
        }

    }
}
