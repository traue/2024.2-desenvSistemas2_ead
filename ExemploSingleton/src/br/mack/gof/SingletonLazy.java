package br.mack.gof;

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        //construtor privado para impedir a instaciação externa
    }

    public static SingletonLazy getInstance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
