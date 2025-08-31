package Notificador;

public class EnvioEmail implements EstrategiaEnvio {
    @Override
    public void enviar(String mensagem) {
        System.out.println("📧 Enviando E-MAIL: " + mensagem);
    }
}
