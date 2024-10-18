package br.mack.factory;

public abstract class Logistica {

    public abstract Transporte criarTransporte();

    public void planejarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }

}
