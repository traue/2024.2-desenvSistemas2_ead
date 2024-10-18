package br.mack.abstractfac;

public class Navio implements Transporte {


    @Override
    public void entregar() {
        System.out.println("Entregando de navio... :D");
    }
}
