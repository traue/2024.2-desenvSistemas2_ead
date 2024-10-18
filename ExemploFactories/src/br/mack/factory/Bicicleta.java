package br.mack.factory;

public class Bicicleta implements  Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando de bike...");
    }

}
