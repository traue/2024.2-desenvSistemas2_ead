package br.mack.abstractfac;


public class Carro implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando de carro... :) ");
    }
}
