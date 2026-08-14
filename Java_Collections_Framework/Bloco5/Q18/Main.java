package Java_Collections_Framework.Bloco5.Q18;

public class Main {

    public static void main(String[] args) {

        Produto mouse =
                new Produto(
                        1,
                        "Mouse",
                        50
                );

        Produto teclado =
                new Produto(
                        2,
                        "Teclado",
                        120
                );

        Produto monitor =
                new Produto(
                        3,
                        "Monitor",
                        900
                );

        Carrinho carrinho =
                new Carrinho();

        carrinho.adicionarItem(
                mouse,
                2
        );

        carrinho.adicionarItem(
                teclado,
                1
        );

        carrinho.adicionarItem(
                monitor,
                1
        );

        System.out.println(
                "Total: R$ "
                        + carrinho.calcularTotal()
        );

        carrinho.aplicarCupom(
                "DESC20",
                20
        );

        System.out.println(
                "Total com desconto: R$ "
                        + carrinho.calcularTotal()
        );

        carrinho.finalizarPedido();

        System.out.println(
                "\nHistórico:"
        );

        carrinho.mostrarHistorico();
    }
}