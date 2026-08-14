package Lista06.Q2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double custoFinal;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getCustoFinal() {
        return custoFinal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setCustoFinal(double custoFinal) {
        this.custoFinal = custoFinal;
    }

    public void calcularPreco() {
        this.custoFinal = this.preco * this.quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nPreco unitario: " + this.preco + "\nQuantidade: " + this.quantidade + "\nCusto total: " + this.custoFinal;
    }
}
