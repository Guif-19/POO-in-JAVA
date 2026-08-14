package Lista06.Q14;

public class Main {

    public static void main(String[] args) {

        NotificacaoEmail e1 = new NotificacaoEmail();
        NotificacaoSMS s1 = new NotificacaoSMS();
        NotificacaoPush p1 = new NotificacaoPush();

        e1.enviar("Mensagem teste 1");
        s1.enviar("Mensagem teste 2");
        p1.enviar("mensagem teste 3");
    }
}
