package Lista03.q3;

import java.util.Scanner;

public class MaisNovo {
    public static void main(String[] args) {

        int i;
        int[] idade = new int[5];
        String[] nome = new String[5];

        Scanner scanner = new Scanner(System.in);
        
        for (i = 0; i < 5; i++){
            System.out.println("Digite o idade: ");
            idade[i] = scanner.nextInt();

            System.out.println("Digite o nome: ");
            nome[i] = scanner.next();
        }

        String n = nome[0];
        int x = idade[0];

        for (i = 0; i < 5; i++){
            if (idade[i] <= x){
                x =  idade[i];
                n = nome[i];
            }

        }

        System.out.println(n + " eh a pessoa mais nova, tendo " + x + " ano(s)");
        
        scanner.close();
        
    }
}
