package Lista06.Q14;

class NotificacaoPush extends Notificacao {

    public void enviar(String mensagem) {
        System.out.println("Push enviado: " + mensagem);
        registrarLog();
    }
}
