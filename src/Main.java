import Notificador.*;

public class Main {
    public static void main(String[] args) {
        
        Notificador notificador = Notificador.getInstancia();

        
        notificador.adicionarObservador(new ObservadorConcreto("Sistema de Logs"));
        notificador.adicionarObservador(new ObservadorConcreto("Monitor de Eventos"));

        
        NotificacaoFacade facade = new NotificacaoFacade(notificador);

        
        facade.enviar("Mensagem importante via E-MAIL", new EnvioEmail());
        facade.enviar("Mensagem urgente via SMS", new EnvioSMS());
        facade.enviar("Notificação via PUSH", new EnvioPush());
    }
}
