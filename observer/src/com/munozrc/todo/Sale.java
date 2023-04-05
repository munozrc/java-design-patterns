package com.munozrc.todo;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class Sale {

    private final String productName;
    private final String customer;
    private final Date date;
    private final int totalPrice;

    public Sale(String productName, String customer, Date date, int totalPrice) {
        this.productName = productName;
        this.customer = customer;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public Month getMonthSale() {
        ZoneId zone = ZoneId.systemDefault();
        LocalDate localDate = date.toInstant().atZone(zone).toLocalDate();
        return localDate.getMonth();
    }

    public String getProductName() {
        return productName;
    }

    public String getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

}
