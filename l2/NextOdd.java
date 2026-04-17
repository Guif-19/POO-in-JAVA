package Lista02;

import java.util.Scanner;

public class NextOdd {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        int x, y;

        System.out.print("Digite um numero: ");
        x = scanner.nextInt();
        y = x % 2;

        int i = (y <= 0) ? (x = x + 2) : (x = x + 1);

        System.out.print("o proximo numero par eh: " + i + ".");


        scanner.close();

    }
}