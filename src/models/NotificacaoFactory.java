package models;

import interfaces.Notificacao;

public abstract class NotificacaoFactory {
    public abstract Notificacao criarNotificacao();

    public void notificarUsuario(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}