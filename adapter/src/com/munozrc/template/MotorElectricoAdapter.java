package com.munozrc.template;

public class MotorElectricoAdapter extends Motor {

    private final MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        super();
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando motor Electrico adapter");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motorElectricoAdapter");
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico...");
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }

}
