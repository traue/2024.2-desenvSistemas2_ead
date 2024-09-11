package br.mack.aulagrasp;

import java.util.Scanner;
public class SistemaVendas {

    public void realizarVenda() {
        Pedido pedido = new Pedido();

        //Scanner sc = new Scanner(System.in);

        //System.out.print("Nome do item: ");
        //String nome = sc.next();

        //..

        pedido.adicionarItemAoPedido("Celular", 500, 1);
        pedido.adicionarItemAoPedido("Pijama", 50, 3);
        pedido.adicionarItemAoPedido("Walkman", 300, 2);
        pedido.adicionarItemAoPedido("Tamagoshi", 100, 8);

        System.out.println("Total da venda: " + pedido.calcularTotalPedido());

    }

}
