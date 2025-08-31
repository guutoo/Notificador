package Notificador;

import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private static Notificador instancia; // Singleton
    private List<Observador> observadores = new ArrayList<>();

    private Notificador() {}

    public static Notificador getInstancia() {
        if (instancia == null) {
            instancia = new Notificador();
        }
        return instancia;
    }

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void notificarObservadores(String mensagem) {
        for (Observador o : observadores) {
            o.atualizar(mensagem);
        }
    }
}
