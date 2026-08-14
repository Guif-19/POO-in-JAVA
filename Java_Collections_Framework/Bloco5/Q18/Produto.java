package Java_Collections_Framework.Bloco5.Q18;

import java.util.Objects;

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
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Produto produto = (Produto) o;

        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return nome;
    }
}