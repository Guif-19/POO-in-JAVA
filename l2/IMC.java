package Lista02;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args){

        double peso, altura, IMC;
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o peso: ");
        peso = scanner.nextDouble();
        System.out.println("digite a altura em metros: ");
        altura = scanner.nextDouble();

        IMC = peso/(altura*altura);

        System.out.println("seu IMC eh: " + IMC + ".");

        scanner.close();
    }
}
