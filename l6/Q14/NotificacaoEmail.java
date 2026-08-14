package Lista06.Q14;

class NotificacaoEmail extends Notificacao {


    public void enviar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
        registrarLog();
    }

}
