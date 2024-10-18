package br.mack.factory;

public class LogisticaRodoviaria extends  Logistica {

    @Override
    public Transporte criarTransporte() {
        return new Carro();
    }
}
