package Java_Collections_Framework.Bloco3.Q11;

public class ItemEstoque {

    private String nome;
    private int quantidade;
    private double precoUnitario;

    public ItemEstoque(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome +
                " | Quantidade: " + quantidade +
                " | Preço: R$" + precoUnitario;
    }
}
