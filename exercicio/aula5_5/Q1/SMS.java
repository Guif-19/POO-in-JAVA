package aula.exercicio.aula5_5.Q1;

public class SMS implements Notificavel {

    String mensagem;
    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("essa mensagem foi eviada via SMS.");
    }

}
