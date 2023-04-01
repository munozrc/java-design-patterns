package com.munozrc.template;

public class ClientMain {

    public static void main(String[] args) {

        Contador c = new Contador(100, 255);
        ObservadorConcreto1 oc1 = new ObservadorConcreto1();
        c.agregarObservador(oc1);

        ObservadorConcreto2 oc2 = new ObservadorConcreto2(c);
        c.agregarObservador(oc2);

        ObservadorConcreto3 oc3 = new ObservadorConcreto3(c);
        c.agregarObservador(oc3);

        System.out.println("Primer Incremento");
        c.incrementarContador(5);

        System.out.println("\nSegundo Incremento");
        c.incrementarContador(5);
        c.eliminarObservador(oc1);

        System.out.println("\nTercer Incremento");
        c.incrementarContador(5);

    }

}
