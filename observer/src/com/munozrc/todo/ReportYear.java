package com.munozrc.todo;

public class ReportYear implements Observer {

    private final SalesReport report;

    public ReportYear(SalesReport rep) {
        this.report = rep;
    }

    @Override
    public void update() {

    }

}
