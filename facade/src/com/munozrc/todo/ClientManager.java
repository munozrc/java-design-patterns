package com.munozrc.todo;

public class ClientManager {

    public static void main(String[] args) {

        StoreFacade sf = new StoreFacade();

        sf.setFullName("Joe Doe");
        sf.setID("1061800882");
        sf.setCardExpDate("2013-7");
        sf.setCardNumber("8384734234523456");
        sf.setCardType("VISA");

        sf.addProduct("Latop Dell", 2600000);
        sf.addProduct("Teclado Razor", 250000);
        sf.addProduct("Monitor LG 24 pulgadas", 1800000);

        if (sf.saveCustomerData()) {
            System.out.println("Datos grabados con éxito!");
        } else {
            System.out.println("No se pudo grabar.");
        }

    }

}
