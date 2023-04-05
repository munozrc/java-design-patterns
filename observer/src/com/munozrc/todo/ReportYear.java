package com.munozrc.todo;

public class ReportYear implements Observer {

    private final SalesReport report;

    public ReportYear(SalesReport rep) {
        this.report = rep;
    }

    @Override
    public void update() {

        int counterSalesFashion = counterSalesFashion = report
                .getSalesByDept(SalesReport.Departments.FASHION)
                .size();

        int counterSalesFood = report
                .getSalesByDept(SalesReport.Departments.FOOD)
                .size();

        int counterSalesHome = report
                .getSalesByDept(SalesReport.Departments.HOME)
                .size();

        System.out.println("\nReporte ventas por año :::::::: ");
        System.out.println("Departamento "
                + SalesReport.Departments.FASHION
                + ": " + counterSalesFashion);
        System.out.println("Departamento "
                + SalesReport.Departments.FOOD
                + ": " + counterSalesFood);
        System.out.println("Departamento "
                + SalesReport.Departments.HOME
                + ": " + counterSalesHome);
        System.out.println("::::::::::::::::::::::::::::::: ");

    }

}
