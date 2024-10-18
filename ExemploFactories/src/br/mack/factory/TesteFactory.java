package br.mack.factory;

public class TesteFactory {

    public static void main(String[] args) {

        Logistica logistica1 = new LogisticaRodoviaria();
        logistica1.planejarEntrega();

        Logistica logistica2 = new LogisticaUrbana();
        logistica2.planejarEntrega();

    }

}
