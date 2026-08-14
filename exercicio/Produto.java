package aula.exercicio;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
    }

    public void valorTotalEstoque() {
        if (preco <= 0) {
            System.out.println("O preco deve ser maior do que 0!");
        } else if (quantidade < 0) {
            System.out.println("O quantidade deve ser mior que zero!");
        } else {
            double valorTotal = quantidade * preco;
            System.out.println("Valor total do estoque de " + nome + ": " + valorTotal);
        }
    }
}