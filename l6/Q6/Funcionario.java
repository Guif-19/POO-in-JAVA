package Lista06.Q6;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome){
        this.nome = nome;
        this.cargo = "Inexistente";
        this.salario = 0;
    }
    public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 1500;
    }
    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario: " + "nome=" + nome + ", cargo=" + cargo + ", salario: " + salario;
    }

}
