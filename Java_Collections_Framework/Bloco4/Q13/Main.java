package Java_Collections_Framework.Bloco4.Q13;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Cliente> fila =
                new PriorityQueue<>(
                        (c1, c2) ->
                                Integer.compare(
                                        c1.getPrioridade(),
                                        c2.getPrioridade()
                                )
                );

        fila.offer(new Cliente("João", 2));
        fila.offer(new Cliente("Maria", 1));
        fila.offer(new Cliente("Pedro", 2));
        fila.offer(new Cliente("Ana", 1));

        while (!fila.isEmpty()) {
            System.out.println(
                    "Atendido: " + fila.poll()
            );
        }
    }
}

//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Queue<String> fila = new LinkedList<>();
//
//        // Chegada dos clientes
//        fila.offer("João");
//        fila.offer("Maria");
//        fila.offer("Pedro");
//
//        System.out.println("Fila atual:");
//        System.out.println(fila);
//
//        // Próximo da fila
//        System.out.println("\nPróximo cliente:");
//        System.out.println(fila.peek());
//
//        // Atendimento
//        System.out.println("\nCliente atendido:");
//        System.out.println(fila.poll());
//
//        System.out.println("\nFila após atendimento:");
//        System.out.println(fila);
//    }
//}
