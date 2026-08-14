package Java_Collections_Framework.Bloco5.Q17;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca =
                new Biblioteca();

        biblioteca.cadastrarLivro(
                new Livro(
                        "123",
                        "Java Básico",
                        "Deitel",
                        2020
                )
        );

        biblioteca.cadastrarLivro(
                new Livro(
                        "456",
                        "Banco de Dados",
                        "Elmasri",
                        2018
                )
        );

        biblioteca.cadastrarLivro(
                new Livro(
                        "789",
                        "Estruturas de Dados",
                        "Cormen",
                        2019
                )
        );

        biblioteca.emprestar(
                "123",
                "2023001"
        );

        biblioteca.emprestar(
                "123",
                "2023002"
        );

        biblioteca.emprestar(
                "123",
                "2023003"
        );

        biblioteca.devolver("123");
        biblioteca.devolver("123");
        biblioteca.devolver("123");

        System.out.println(
                "\nRELATÓRIO"
        );

        biblioteca.relatorio();
    }
}