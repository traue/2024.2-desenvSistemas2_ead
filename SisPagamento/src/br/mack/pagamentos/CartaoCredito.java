package br.mack.pagamentos;

import java.util.Date;

public class CartaoCredito extends Pagamento {

    private String numeroCartao;
    private String titular;
    private Date validade;
    private int cvv;

    public CartaoCredito(double valor, String numeroCartao, String titular, Date validade, int cvv) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.validade = validade;
        this.cvv = cvv;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " realizado com cartão!");
        System.out.println("Dados do cartão:");
        System.out.println(" - Titular: " + titular);
        System.out.println(" - Número do cartão: " + numeroCartao);
        System.out.println(" - Validade: " + validade);
        System.out.println(" - CVV: " + cvv);
    }
}
