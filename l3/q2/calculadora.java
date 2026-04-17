package Lista03.q2;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        int x, y, i;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1 - Tabuada \n 2 - Sequencia \n 3 - Sair");
        x = scanner.nextInt();

        switch (x) {
            case 1: x = 1;
                System.out.print("Digite um numero de 1 a 10: ");
                y = scanner.nextInt();
            if (y<1 || y>10) {
                System.out.println("Erro, digite um numero entre 1 e 10");
            }else {
                for (i = 1; i <= 10; i++) {
                    System.out.println((y*i));
                }
            }
            case 2: x = 2; break;
            case 3: x = 3; break;
            default:
                System.out.println("Erro, escolha uma das 3 opcoes!");
        }
    }
}
