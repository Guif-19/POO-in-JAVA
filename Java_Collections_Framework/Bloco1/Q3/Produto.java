package Java_Collections_Framework.Bloco1.Q3;

import java.util.List;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    static Main maiorCem(List<Produto> produtos){
        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getPreco() > 100){
                System.out.println(produtos.get(i));
            }
        }
        return null;
    }

}
