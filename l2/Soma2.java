package Lista02;

import java.util.Scanner;

public class Soma2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.print("Digite o primeiro numero: ");
        x = scanner.nextDouble();
        System.out.print("digite o segundo numero: ");
        y = scanner.nextDouble();
        z = x + y;

        scanner.close();
        System.out.println("a soma eh: " + z + ".");
    }

}
