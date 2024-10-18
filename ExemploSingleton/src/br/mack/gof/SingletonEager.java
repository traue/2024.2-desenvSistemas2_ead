package br.mack.gof;

public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    public static SingletonEager getInstance() {
        return instancia;
    }

}
