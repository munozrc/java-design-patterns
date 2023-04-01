package com.munozrc.template;

public class ObservadorConcreto3 implements Observador {

    // Mantiene asociacion con el sujeto observable
    private final Contador contador;

    // El constructor establece la asociacion entre ValorContador-Contador
    public ObservadorConcreto3(Contador contador) {
        this.contador = contador;
    }

    /*
    * Tras ser notificado de un cambio, un observador ValorContador accedeal
    * estado del Contador utilizando la asociacion
     */
    @Override
    public void actualizar() {
        System.out.println("Valor del contador de ObservadorConcreto3 es " + contador.getValor());
    }
}
