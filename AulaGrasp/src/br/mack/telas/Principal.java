package br.mack.telas;

import br.mack.aulagrasp.ItemPedido;
import br.mack.aulagrasp.Pedido;
import br.mack.aulagrasp.SistemaVendas;

public class Principal {

    public static void main(String[] args) {

        SistemaVendas pdv = new SistemaVendas();
        pdv.realizarVenda();

        //ItemPedido item = new ItemPedido("MacBook Pro", 60000, 3);
        //p1.adicionarItemAoPedido(item); -> Não funcoina pois não temos essa implementação
        //e a ideia é realmente não ter! Para não quebrar o padrão Creator do GRAPS
    }

}
