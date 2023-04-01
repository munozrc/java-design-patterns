package com.munozrc.template;

public class Contador extends Observable {

    // Atributos privados que mantienen el estado del contador
    private int valor;
    private final int maximo;

    /*
    * El constructor inicializa el estado del objeto: el maximo y elvalor
    * inicial, siempre en el rango 0..maximo. Adicionalmente,inicializa la
    * parte de Observable que tiene un Contador...
     */
    public Contador(int valor, int maximo) {
        super();
        this.maximo = maximo;
        this.valor = enRango(valor);
    }

    // Este metodo privado asegura que un valor n esta entre 0..maximo
    private int enRango(int n) {
        if (n < 0) {
            return 0;
        } else if (n > maximo) {
            return maximo;
        } else {
            return n;
        }
    }

    /**
     * Estos dos metodos permiten el acceso al estado del contador
     *
     * @return el valor del contador
     */
    public int getValor() {
        return valor;
    }

    public int getMaximo() {
        return maximo;
    }

    /*
    * Este metodo afecta al estado: primero se modifica de forma consistenteel
    * estado y despues se notifica a los observadores del cambio
     */
    public void incrementarContador(int n) {
        valor = enRango(valor + n);
        notificarObservadores();
    }

}
