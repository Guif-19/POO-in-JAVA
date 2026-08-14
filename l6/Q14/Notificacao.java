package Lista06.Q14;

import java.time.LocalDateTime;

public abstract class Notificacao {

    public abstract void enviar(String mensagem);
    public void registrarLog() {
        System.out.println("Enviado em: " + LocalDateTime.now());
    }

}
