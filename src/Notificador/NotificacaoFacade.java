package Notificador;

public class NotificacaoFacade {
    private Notificador notificador;

    public NotificacaoFacade(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviar(String mensagem, EstrategiaEnvio estrategia) {
        estrategia.enviar(mensagem);
        notificador.notificarObservadores(mensagem);
    }
}
