package br.mack.gof.adapter;

/*
    como se fosse a implementação "legada" de um retângulo a qual não
    posso remover do sistema pois ainda é usada por muitas outras classes
 */

public class DesenhoAntigo {

    public void desenharRetangulo() {
        System.out.println("Desenhando um retângulo...\n");

        System.out.println("\t|-------------|");
        System.out.println("\t|             |");
        System.out.println("\t|-------------|");
    }

    public void desenharPorquinho() {
        System.out.println("Desenhando o porquinho do chaves...\n");
        System.out.println("   M");
        System.out.println();
        System.out.println("E          S");
        System.out.println();
        System.out.println("  W      W ");
    }

}
