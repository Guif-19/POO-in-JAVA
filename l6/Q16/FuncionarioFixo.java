package Lista06.Q16;

class FuncionarioFixo implements Pagavel {

    private double salario;

    public FuncionarioFixo(double salario) {
        this.salario = salario;
    }

    public double calcularPagamento() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    @Override
    public String toString() {
        return "Funcionario Fixo " + "\nsalario=" + calcularPagamento();
    }
}
