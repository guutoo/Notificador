package Notificador;

public class ObservadorConcreto implements Observador {
    private String nome;

    public ObservadorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("👀 [" + nome + "] recebeu atualização: " + mensagem);
    }
}
