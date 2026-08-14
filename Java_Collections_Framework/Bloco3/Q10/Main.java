package Java_Collections_Framework.Bloco3.Q10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        frase = frase.toLowerCase();

        String[] palavras = frase.split(" ");

        Map<String, Integer> contador = new HashMap<>();

        for (String palavra : palavras) {

            contador.put(
                    palavra,
                    contador.getOrDefault(palavra, 0) + 1
            );
        }

        System.out.println(contador);

        sc.close();
    }
}