package com.munozrc.todo;

import com.munozrc.template.*;

public class ClientMain {

    public static void main(String[] args) {

        CocinaDirector cocina = new CocinaDirector();
        PizzaBuilder conoPizzaBuilder = new ConoPizzaBuilder();
        cocina.setPizzaBuilder(conoPizzaBuilder);
        cocina.construirPizza();

        Pizza pizza = cocina.getPizza();
        System.out.println("Pizza ---> " + pizza);

    }

}
