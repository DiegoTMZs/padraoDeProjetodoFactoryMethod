package models;

import interfaces.Notificacao;

public class SMSFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}