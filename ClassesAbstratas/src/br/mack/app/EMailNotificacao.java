package br.mack.app;

public class EMailNotificacao extends Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }

}
