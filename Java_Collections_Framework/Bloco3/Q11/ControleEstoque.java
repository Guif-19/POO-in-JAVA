package Java_Collections_Framework.Bloco3.Q11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControleEstoque {

    private Map<Integer, ItemEstoque> estoque = new HashMap<>();

    // adicionarItem
    public void adicionarItem(int codigo, ItemEstoque item) {
        estoque.put(codigo, item);
    }

    // darBaixa
    public void darBaixa(int codigo, int quantidade)
            throws EstoqueInsuficienteException {
        ItemEstoque item = estoque.get(codigo);

        if (item == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        if (item.getQuantidade() < quantidade) {
            throw new EstoqueInsuficienteException(
                    "Estoque insuficiente!"
            );
        }

        item.setQuantidade(
                item.getQuantidade() - quantidade
        );
    }

    // valorTotalEstoque
    public double valorTotalEstoque() {

        double total = 0;

        for (ItemEstoque item : estoque.values()) {

            total += item.getQuantidade()
                    * item.getPrecoUnitario();
        }

        return total;
    }

    // itensAbaixoDe
    public List<ItemEstoque> itensAbaixoDe(
            int limite) {

        List<ItemEstoque> resultado =
                new ArrayList<>();

        for (ItemEstoque item : estoque.values()) {

            if (item.getQuantidade() < limite) {
                resultado.add(item);
            }
        }

        return resultado;
    }
}
