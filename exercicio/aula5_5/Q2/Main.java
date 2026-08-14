package aula.exercicio.aula5_5.Q2;

public class Main {
    public static void main(String[] args) {

        Pix pix = new Pix();
        CartaoCredito cartaoCredito = new CartaoCredito();

        pix.pagar(10.00);
        cartaoCredito.pagar(20000.00);
    }
}
