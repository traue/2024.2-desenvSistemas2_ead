package br.mack.loja;

public class Cliente implements Observador {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualziar(String produto, String mensagem) {
        System.out.println("Olá " + nome + ", chegou mensagem para você sobre: " + produto + " >> " + mensagem);
    }

}
