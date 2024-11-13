package br.mack.loja;

public interface SujeitoObservado {

    void inscrever(Observador observador);
    void desinscrever(Observador observador);
    void notificarObservador(String produto, String mensagem);

}
