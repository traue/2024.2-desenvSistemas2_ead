package br.mack.aulagrasp;

import java.util.List;
import java.util.ArrayList;
public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItemAoPedido(String nomeItem, double precoUnitario, int qtd) {

        //padrão Creator, ou seja, a responsabilidade de criar um objeto agregado é dessa classe!
        ItemPedido item = new ItemPedido(nomeItem, precoUnitario, qtd);
        itens.add(item);
    }

    public double calcularTotalPedido() {
        return itens.stream()
                .mapToDouble(ItemPedido::calculaSubTotal)
                .sum();
    }

}
