package Lista06.Q14;

class NotificacaoSMS extends Notificacao {

    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
        registrarLog();
    }
}
