package Java_Collections_Framework.Bloco1.Q4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        long inicio = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            lista.add(0, i);
        }

        long fim = System.nanoTime();

        System.out.println("tamanho: " + lista.size());
        System.out.println("Tempo: " + (fim - inicio) + " ns");

//===================================================================================================

        List<Integer> listaFinal = new ArrayList<>();

        long inicio2 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            lista.add(i);
        }

        long fim2 = System.nanoTime();

        System.out.println("tamanho: " + lista.size());
        System.out.println("Tempo: " + (fim2 - inicio2) + " ns");


//===================================================================================================

        List<Integer> listaLink = new LinkedList<>();

        long inicio3 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            listaLink.add(0, i);
        }

        long fim3 = System.nanoTime();

        System.out.println("tamanho: " + listaLink.size());
        System.out.println("Tempo: " + (fim3 - inicio3) + " ns");

//===================================================================================================

        List<Integer> listaLinkFinal = new LinkedList<>();

        long inicio4 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            listaLinkFinal.add(i);
        }

        long fim4 = System.nanoTime();

        System.out.println("tamanho: " + listaLinkFinal.size());
        System.out.println("Tempo: " + (fim4 - inicio4) + " ns");
    }

    //O ArrayList é baseado em vetor, portanto inserir na posição 0 exige deslocar todos os elementos existentes.
    // Já o LinkedList é baseado em nós encadeados, permitindo inserir no início apenas ajustando referências,
    // sem deslocar os demais elementos.

    //Tempos
    //Arraylist inserindo no inicio
    //Tempo: 1116058200 ns
    //Arraylist inserindo no final
    //Tempo: 3586300 ns
    //Linkedlist inserindo no inicio
    //Tempo: 6393200 ns
    //Linkedlist inserindo no final
    //Tempo: 4303700 ns
}
