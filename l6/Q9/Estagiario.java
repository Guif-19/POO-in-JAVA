package Lista06.Q9;

public class Estagiario extends Funcionario {
    private int cargaHoraria;

    Estagiario(String nome, String cpf, double salarioBase, int cargaHoraria) {
        super(nome, cpf, salarioBase);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setDepartamento(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Estagiario \nCarga horaria: " + cargaHoraria + "\nNome: " + super.getNome() + "\nCPF: " + super.getCpf() +  "\nSalario Base: " + super.getSalarioBase();
    }
}
