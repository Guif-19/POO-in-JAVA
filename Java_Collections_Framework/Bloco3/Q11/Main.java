package Java_Collections_Framework.Bloco3.Q11;

public class Main {

    public static void main(String[] args) {

        ControleEstoque estoque =
                new ControleEstoque();

        estoque.adicionarItem(
                1,
                new ItemEstoque(
                        "Mouse",
                        20,
                        50
                )
        );

        estoque.adicionarItem(
                2,
                new ItemEstoque(
                        "Teclado",
                        5,
                        120
                )
        );

        estoque.adicionarItem(
                3,
                new ItemEstoque(
                        "Monitor",
                        2,
                        900
                )
        );

        try {

            estoque.darBaixa(1, 10);

            estoque.darBaixa(3, 5);

        } catch (EstoqueInsuficienteException e) {

            System.out.println(e.getMessage());
        }

        System.out.println(
                "Valor total: R$"
                        + estoque.valorTotalEstoque()
        );

        System.out.println(
                "\nItens abaixo de 6 unidades:"
        );

        System.out.println(
                estoque.itensAbaixoDe(6)
        );
    }
}