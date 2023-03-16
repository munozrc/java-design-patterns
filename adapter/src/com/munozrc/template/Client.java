package com.munozrc.template;

public class Client {

    public static void main(String[] args) {

        Motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();

        System.out.println("");

        motor = new MotorGaston();
        motor.encender();
        motor.acelerar();
        motor.apagar();

        System.out.println("");

        motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();

    }

}
