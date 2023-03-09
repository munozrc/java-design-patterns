package com.munozrc.template;

public class ClientMain {

    public static void main(String[] args) {

        CocinaDirector cocina = new CocinaDirector();
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
        cocina.setPizzaBuilder(hawai_pizzabuilder);
        cocina.construirPizza();

        Pizza pizza = cocina.getPizza();
        System.out.println("Pizza ---> " + pizza);

        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
        cocina.setPizzaBuilder(picante_pizzabuilder);
        cocina.construirPizza();
        pizza = cocina.getPizza();
        System.out.println("Pizza ---> " + pizza);

    }

}
