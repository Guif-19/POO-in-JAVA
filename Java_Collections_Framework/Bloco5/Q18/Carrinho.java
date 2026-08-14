package Java_Collections_Framework.Bloco5.Q18;

import java.util.*;

public class Carrinho {

    private Map<Produto, Integer> itens =
            new HashMap<>();

    private List<Pedido> historico =
            new ArrayList<>();

    private Set<String> cuponsUsados =
            new HashSet<>();

    private double desconto = 0;

    public void adicionarItem(
            Produto produto,
            int quantidade) {

        itens.put(
                produto,
                itens.getOrDefault(produto, 0)
                        + quantidade
        );
    }

    public void removerItem(
            Produto produto) {

        itens.remove(produto);
    }

    public void alterarQuantidade(
            Produto produto,
            int quantidade) {

        if (itens.containsKey(produto)) {

            itens.put(
                    produto,
                    quantidade
            );
        }
    }

    public double calcularTotal() {

        double total = 0;

        for (Produto produto : itens.keySet()) {

            total +=
                    produto.getPreco()
                            * itens.get(produto);
        }

        total -= desconto;

        return total;
    }

    public void aplicarCupom(
            String cupom,
            double valor) {

        if (cuponsUsados.contains(cupom)) {

            System.out.println(
                    "Cupom já utilizado."
            );

            return;
        }

        desconto += valor;

        cuponsUsados.add(cupom);

        System.out.println(
                "Cupom aplicado."
        );
    }

    public void finalizarPedido() {

        Pedido pedido =
                new Pedido(
                        new HashMap<>(itens),
                        calcularTotal()
                );

        historico.add(pedido);

        itens.clear();

        desconto = 0;

        System.out.println(
                "Pedido finalizado."
        );
    }

    public void mostrarHistorico() {

        for (Pedido pedido : historico) {

            System.out.println(pedido);
        }
    }

}

