package aula.exercicio.aula5_5.Q1;

public class Main {
    public static void main(String[] args) {

        Email email = new Email();
        SMS sms = new SMS();

        email.enviarMensagem("Mensagem email");
        sms.enviarMensagem("Mensagem sms");
    }
}
