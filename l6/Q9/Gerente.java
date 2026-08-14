package Lista06.Q9;

public class Gerente extends Funcionario {
    private String departamento;

    Gerente(String nome, String cpf, double salarioBase, String departamento) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente \nDepartamento: " + departamento + "\nNome: " + super.getNome() + "\nCPF: " + super.getCpf() +  "\nSalario Base: " + super.getSalarioBase();
    }
}
