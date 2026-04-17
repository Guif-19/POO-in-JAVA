package Lista02;

import java.util.Scanner;

public class Aprorreprovado {

    public static void main(String[] args){
        double nota1, nota2, nota3, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a nota 1: ");
        nota1 = scanner.nextDouble();
        System.out.println("digite a nota 2: ");
        nota2 = scanner.nextDouble();
        System.out.println("digite a nota 3: ");
        nota3 = scanner.nextDouble();

        media = (nota1+nota2+nota3)/3;

        if (media >=100 || media < 0){
            System.out.println("média inválida");
        } else if (media >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }


}
