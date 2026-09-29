package models;

import interfaces.Notificacao;

public class NotificacaoEmail implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}