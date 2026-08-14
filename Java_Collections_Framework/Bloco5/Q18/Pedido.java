package Java_Collections_Framework.Bloco5.Q18;

import java.util.Map;

public class Pedido {

    private Map<Produto,Integer> itens;
    private double total;

    public Pedido(
            Map<Produto,Integer> itens,
            double total) {

        this.itens = itens;
        this.total = total;
    }

    @Override
    public String toString() {

        return "Pedido{" +
                "total=R$" + total +
                ", itens=" + itens +
                '}';
    }
}