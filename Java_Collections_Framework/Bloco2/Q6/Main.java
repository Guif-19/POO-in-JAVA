package Java_Collections_Framework.Bloco2.Q6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> MegaSena = new HashSet<>();
        Random random = new Random();

        while (MegaSena.size() < 6) {

            int numero = random.nextInt(60) + 1;

            MegaSena.add(numero);
        }

        System.out.println("Números sorteados:");
        System.out.println(MegaSena);
    }
}