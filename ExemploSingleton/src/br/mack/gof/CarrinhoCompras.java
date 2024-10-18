package br.mack.gof;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private static CarrinhoCompras instancia;
    private List<String> itens;

    private CarrinhoCompras() {
        this.itens = new ArrayList<String>();
    }

    public static CarrinhoCompras getInstancia() {
        if (instancia == null) {
            instancia = new CarrinhoCompras();
        }
        return instancia;
    }

    public void adicionar(String iten) {
        itens.add(iten);
        System.out.println("Item adicionado: " + iten);
    }

    public void remover(String iten) {
        itens.remove(iten);
        System.out.println("Item removido: " + iten);
    }

    public void listarItens() {
        System.out.println("Itens no carrinho:" );
        for (String iten : itens) {
            System.out.println(" - " + iten);
        }
    }

}
