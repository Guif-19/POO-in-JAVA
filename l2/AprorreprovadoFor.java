package Lista02;
import java.util.Scanner;

public class AprorreprovadoFor {
    public static void main(String[] args){
        int numero, i;
        double media, notas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("quantas notas serão digitadas? ");
        numero = scanner.nextInt();

        double[] notasDigitadas = new double[numero];

        for (i = 0; i < numero; i++) {
            System.out.println("digite a nota " + (i + 1) + ": ");
            notasDigitadas[i] = scanner.nextDouble();
            notas += notasDigitadas[i];
        }

        if (numero>0){
            media = (notas)/numero;
            for (i = 0; i < notasDigitadas.length; i++) {
                System.out.println("Nota " + (i + 1) + ": " + notasDigitadas[i]);
            }
            System.out.println("media de: " + media + ".");
            if (media >=100 || media < 0){
                System.out.println("média inválida");
            } else if (media >= 60) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }

        scanner.close();
    }
}
