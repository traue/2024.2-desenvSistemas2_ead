package br.mack.app;

public class SMSNotificacao extends Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }


}
