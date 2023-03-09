package com.munozrc.todo;

import com.munozrc.template.PizzaBuilder;

public class ConoPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        pizza.setMasa("crujiente");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("mixta");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("queso");
    }

}
