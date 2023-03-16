package com.munozrc.template;

public class MotorGaston extends Motor {

    public MotorGaston() {
        super();
        System.out.println("Creando el motor gaston");
    }

    @Override
    public void encender() {
        System.out.println("Bum, bum....encendiendo motor gaston");
    }

    @Override
    public void acelerar() {
        System.out.println("Buuuuuuuuuuuum, acelerando y gastando muuuucha gas");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor gaston");
    }

}
