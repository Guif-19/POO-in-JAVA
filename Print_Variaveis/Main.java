package Print_Variaveis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // comentario
        /*
        co
        men
        ta
        rio
        */

     //    System.out.print("I like boobs\n");
     //    System.out.println("It's  really soft");
     //    System.out.print("Let me see some");


        int age = 23;
        double gpa = 3.5;
        char letter = 'a';
        System.out.println((age));
        boolean isStudent = false;
        boolean forSale = false;

        if(isStudent){
            System.out.println("u're a student");
        }
        else {
            System.out.println("u're not a student");
        }

        String name = "Tuta";
        System.out.println("o melhor eh o: " + name);

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter ur name: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();


    }
}
