package br.mack.pagamentos;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private List<Pagamento> pagamentos = new ArrayList<>();

    public void adicionarMeioPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void finalizarCompra() {
        for (Pagamento pagamento : pagamentos) {
            pagamento.realizarPagamento();
        }
    }

}
