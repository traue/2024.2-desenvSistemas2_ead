package br.mack.pagamentos;

import java.util.Date;

public class SistemaCompra {

    public static void main(String[] args) {

        Compra compra = new Compra();

        //pgto com dinheiro
        Pagamento pagamentoDinheiro = new Dinheiro(40);

        //pgto com cartão
        Pagamento pagamentoCartao = new CartaoCredito(
                53.25,
                "1234 1234 4321 4321",
                "Vitor Barbosa",
                new Date(),
                123);

        compra.adicionarMeioPagamento(pagamentoDinheiro);
        compra.adicionarMeioPagamento(pagamentoCartao);

        compra.finalizarCompra();

    }

}
