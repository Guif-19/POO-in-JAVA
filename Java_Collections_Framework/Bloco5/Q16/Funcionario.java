package Java_Collections_Framework.Bloco5.Q16;

public class Funcionario implements Comparable<Funcionario>{

    private String nome;
    private String setor;
    private double salario;

    public Funcionario(String nome, String setor, double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Funcionario outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome +
                " | " +
                setor +
                " | R$ " +
                salario;
    }
}
