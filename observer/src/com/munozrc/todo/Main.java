package com.munozrc.todo;

import java.time.Month;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        SalesReport report = new SalesReport();
        SalesReport.Departments dept = SalesReport.Departments.FASHION;

        ReportMonthly reportMonth = new ReportMonthly(report, dept, Month.JANUARY);
        ReportYear reportYear = new ReportYear(report);

        report.attach(reportMonth);
        report.attach(reportYear);
        
        report.addNewSale(dept, new Sale("Camisa", "Paola", new Date(2023, 0, 20), 120000));
        report.addNewSale(dept, new Sale("Camisa", "Paola", new Date(2023, 0, 20), 120000));
        report.addNewSale(dept, new Sale("Camisa", "Paola", new Date(2023, 0, 20), 120000));

    }

}
