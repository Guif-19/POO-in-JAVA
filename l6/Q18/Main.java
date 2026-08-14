package Lista06.Q18;

public class Main {

    public static void main(String[] args) {

        Calculadora c1 = new Calculadora(10, 0);

        try {
            System.out.println("Resultado: " + c1.dividir(10, 0));

        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}