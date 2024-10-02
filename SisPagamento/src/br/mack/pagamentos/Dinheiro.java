package br.mack.pagamentos;

public class Dinheiro extends Pagamento {

    public Dinheiro(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " realizado em dinheiro!");
    }
}
