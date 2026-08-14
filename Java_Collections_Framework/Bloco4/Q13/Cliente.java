package Java_Collections_Framework.Bloco4.Q13;

public class Cliente {

    private String nome;
    private int prioridade;

    public Cliente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return nome;
    }
}