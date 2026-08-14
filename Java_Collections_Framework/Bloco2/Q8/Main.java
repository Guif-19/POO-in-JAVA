package Java_Collections_Framework.Bloco2.Q8;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> poo = new HashSet<>();

        poo.add("Ana");
        poo.add("Bruno");
        poo.add("Carlos");
        poo.add("Daniel");
        poo.add("Eduardo");

        Set<String> bd = new HashSet<>();

        bd.add("Carlos");
        bd.add("Daniel");
        bd.add("Fernanda");
        bd.add("Gabriel");
        bd.add("Helena");

        Set<String> uniao = new HashSet<>(poo);
        uniao.addAll(bd);

        Set<String> intersecao = new HashSet<>(poo);
        intersecao.retainAll(bd);

        Set<String> diferenca = new HashSet<>(poo);
        diferenca.removeAll(bd);

        System.out.println("União: " + uniao);
        System.out.println("Interseção: " + intersecao);
        System.out.println("Diferença: " + diferenca);
    }
}