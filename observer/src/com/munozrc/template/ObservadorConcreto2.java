package com.munozrc.template;

/**
 * Un ejemplo de observador concreto de la clase contador.
 *
 */
public class ObservadorConcreto2 implements Observador {

    // Mantiene la asociacion con el contador
    private Contador contador;

    // El constructor de Medidor establece la asociacion entre Medidor-Contador
    public ObservadorConcreto2(Contador contador) {
        this.contador = contador;
    }

    /*
    * Tras ser notificado de un cambio, un observador Medidor accedeal estado
    * del Contador utilizando la asociacion
     */
    @Override
    public void actualizar() {
        System.out.println("Valor del contador de ObservadorConcreto2: " + contador.getValor());
    }

}
