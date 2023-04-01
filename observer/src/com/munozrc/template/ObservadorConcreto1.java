package com.munozrc.template;

public class ObservadorConcreto1 implements Observador {

    @Override
    public void actualizar() {
        System.out.println("Observador concreto simple recibe actualizar!");
    }
}
