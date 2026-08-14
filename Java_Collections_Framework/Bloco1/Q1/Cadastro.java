package Java_Collections_Framework.Bloco1.Q1;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Rodrigues");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Gabrielly");
        nomes.add("Julia");
        nomes.add("Renan");


        System.out.println(nomes);
        System.out.println(nomes.size());

        if (nomes.contains("Ana")) {
            System.out.println(nomes.contains("O nome Ana est´presente na lista"));
        }

        nomes.remove(2);
        nomes.remove("Maria");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
