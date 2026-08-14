package aula.exercicio.aula5_5.Q1;

public class Email implements Notificavel {

    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("essa mensagem foi eviada por um e-mail.");
    }

}
