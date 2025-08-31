package Notificador;

public class EnvioPush implements EstrategiaEnvio {
    @Override
    public void enviar(String mensagem) {
        System.out.println("🔔 Enviando PUSH: " + mensagem);
    }
}
