package com.munozrc.todo;

import java.util.ArrayList;

public class SalesReport extends Observable {

    private final ArrayList<Sale> fashionSales;
    private final ArrayList<Sale> foodSales;
    private final ArrayList<Sale> homeSales;

    public SalesReport() {
        super();

        this.fashionSales = new ArrayList<>();
        this.foodSales = new ArrayList<>();
        this.homeSales = new ArrayList<>();
    }

    public void addNewSale(Departments dept, Sale sale) {

        if (Departments.FASHION.equals(dept)) {
            this.fashionSales.add(sale);
        }

        if (Departments.FOOD.equals(dept)) {
            this.foodSales.add(sale);
        }

        if (Departments.HOME.equals(dept)) {
            this.homeSales.add(sale);
        }

        System.out.println("\nNuevas venta registrada...");

        this.notifyObservers();
    }

    public static enum Departments {
        FASHION, FOOD, HOME
    }

    public ArrayList<Sale> getSalesByDept(Departments dept) {

        if (Departments.FASHION.equals(dept)) {
            return this.fashionSales;
        }

        if (Departments.FOOD.equals(dept)) {
            return this.foodSales;
        }

        return this.homeSales;
    }

}
