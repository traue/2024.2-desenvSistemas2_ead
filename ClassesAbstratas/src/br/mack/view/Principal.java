package br.mack.view;

import br.mack.app.EMailNotificacao;
import br.mack.app.Notificacao;
import br.mack.app.PushNotificacao;
import br.mack.app.SMSNotificacao;

public class Principal {

    public static void main(String[] args) {

        Notificacao email = new EMailNotificacao();
        Notificacao sms = new SMSNotificacao();
        Notificacao push = new PushNotificacao();

        email.enviar("Prezado Fulano, segue orçamento...");
        sms.enviar("Ligue para 0800 e veja condição exclusiva!");
        push.enviar("Compra aprovada no valro de R$ 5000");

    }

}
