package Lista02;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {

        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        x = scanner.nextInt();
        y = x % 2;
        scanner.close();

        if(y == 0){
            System.out.println(x + " eh par.");
        }
        else {
            System.out.println(x + " nao eh par.");
        }
    }
}