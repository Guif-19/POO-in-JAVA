package Lista06.Q9;

public class Vendedor extends Funcionario {
    private int metaMensal;

    Vendedor(String nome, String cpf, double salarioBase, int metaMensal) {
        super(nome, cpf, salarioBase);
        this.metaMensal = metaMensal;
    }

    public int getMetaMensal() {
        return metaMensal;
    }
    public void setDepartamento(int metaMensal) {
        this.metaMensal = metaMensal;
    }

    @Override
    public String toString() {
        return "Vendedor de tudo " + "\nMeta Mensal: " + metaMensal + "\nNome: " + super.getNome() + "\nCPF: " + super.getCpf() +  "\nSalario Base: " + super.getSalarioBase();
    }
}
