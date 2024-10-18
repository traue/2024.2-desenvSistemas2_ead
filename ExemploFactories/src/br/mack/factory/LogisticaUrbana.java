package br.mack.factory;

public class LogisticaUrbana extends Logistica {


    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}
