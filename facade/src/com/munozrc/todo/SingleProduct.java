package com.munozrc.todo;

public class SingleProduct {

    private final String name;
    private final int price;

    public SingleProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
