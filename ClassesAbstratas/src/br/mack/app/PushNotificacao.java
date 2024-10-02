package br.mack.app;

public class PushNotificacao extends Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação PUSH: " + mensagem);
    }

}
