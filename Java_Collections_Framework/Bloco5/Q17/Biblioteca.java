package Java_Collections_Framework.Bloco5.Q17;

import java.util.*;

public class Biblioteca {

    private Map<String, Livro> acervo =
            new HashMap<>();

    private Set<String> emprestados =
            new HashSet<>();

    private Map<String, Queue<String>> reservas =
            new HashMap<>();

    public void cadastrarLivro(Livro livro) {

        acervo.put(
                livro.getIsbn(),
                livro
        );

        reservas.put(
                livro.getIsbn(),
                new LinkedList<>()
        );
    }

    public void emprestar(
            String isbn,
            String matricula) {

        if (!acervo.containsKey(isbn)) {

            System.out.println(
                    "Livro inexistente."
            );

            return;
        }

        if (!emprestados.contains(isbn)) {

            emprestados.add(isbn);

            System.out.println(
                    "Livro emprestado para "
                            + matricula
            );
        }

        else {

            reservas.get(isbn)
                    .offer(matricula);

            System.out.println(
                    matricula +
                            " entrou na fila."
            );
        }
    }

    public void devolver(
            String isbn) {

        if (!emprestados.contains(isbn)) {

            System.out.println(
                    "Livro não está emprestado."
            );

            return;
        }

        Queue<String> fila =
                reservas.get(isbn);

        if (!fila.isEmpty()) {

            String proximo =
                    fila.poll();

            System.out.println(
                    "Livro repassado para "
                            + proximo
            );
        }

        else {

            emprestados.remove(isbn);

            System.out.println(
                    "Livro devolvido."
            );
        }
    }

    public void relatorio() {

        List<Livro> livros =
                new ArrayList<>(
                        acervo.values()
                );

        livros.sort(
                Comparator.comparing(
                        Livro::getTitulo
                )
        );

        for (Livro livro : livros) {

            System.out.println(livro);
        }
    }
}