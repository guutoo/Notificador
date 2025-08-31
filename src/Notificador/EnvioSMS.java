package Notificador;

public class EnvioSMS implements EstrategiaEnvio {
    @Override
    public void enviar(String mensagem) {
        System.out.println("📱 Enviando SMS: " + mensagem);
    }
}
