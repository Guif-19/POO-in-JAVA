package Lista02;

import java.util.Scanner;

public class IsPositive {
    public static void main(String[] args){
        int x;

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero: ");
        x = scanner.nextInt();

        if(x>=0) {
            System.out.println("o numero " + x + " eh  positivo");
        }else {
            System.out.println("o numero " + x + " eh  negativo");
        }

        scanner.close();
    }
}
