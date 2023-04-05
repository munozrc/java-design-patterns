package com.munozrc.todo;

import java.time.Month;
import java.util.ArrayList;

public class ReportMonthly implements Observer {

    private final SalesReport report;
    private final SalesReport.Departments department;
    private final Month month;

    public ReportMonthly(SalesReport rep, SalesReport.Departments dept, Month m) {
        this.report = rep;
        this.department = dept;
        this.month = m;
    }

    @Override
    public void update() {

        ArrayList<Sale> sales = report.getSalesByDept(department);

        int counterSales = 0;

        for (Sale currentSale : sales) {
            if (currentSale.getMonthSale() == month) {
                counterSales++;
            }
        }

        System.out.println("\nReporte Mensual ::::::::::::::: ");
        System.out.println("Departament: " + department);
        System.out.println("Mes: " + month);
        System.out.println("Ventas: " + counterSales);
        System.out.println("::::::::::::::::::::::::::::::: ");

    }

}
