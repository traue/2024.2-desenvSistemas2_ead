package br.mack.loja;

import java.util.ArrayList;
import java.util.List;

public class Loja implements SujeitoObservado {

    private final List<Observador> clientes = new ArrayList<>();

    @Override
    public void inscrever(Observador observador) {
        clientes.add(observador);
    }

    @Override
    public void desinscrever(Observador observador) {
        clientes.remove(observador);
    }

    @Override
    public void notificarObservador(String produto, String mensagem) {
        for (Observador cliente : clientes) {
            cliente.atualziar(produto, mensagem);
        }
    }

    public void produtoChegou(String produto, String mensagem) {
        System.out.println("Opa, chegou um produto novo!!");
        System.out.println("   - Produto: " + produto);
        System.out.println("   - Mensagem: " + mensagem + "\n");

        notificarObservador(produto, mensagem);
    }
}
