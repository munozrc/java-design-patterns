package com.munozrc.todo;

import java.util.ArrayList;

public class ListOfProducts {

    private final ArrayList<SingleProduct> products;
    private final String PRODUCTS_FILE = "list-of-products.txt";

    public ListOfProducts(ArrayList<SingleProduct> products) {
        this.products = products;
    }

    public boolean isValid() {
        return !products.isEmpty();
    }

    public boolean save() {
        String dataLine = "";

        for (SingleProduct product : this.products) {
            dataLine += product.getName() + " (price=" + product.getPrice() + "), ";
        }

        System.out.println("Grabado el archivo " + PRODUCTS_FILE + " Texto: \u001B[33m" + dataLine + "\u001B[0m");
        return true;
    }

}
