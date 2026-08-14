package Lista06.Q16;

class Freelancer implements Pagavel {

    private double valorHora;
    private int horasTrabalhadas;

    public Freelancer(double valorHora, int horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularPagamento() {
        return valorHora * horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Funcionario Freelancer " + "\nsalario=" + calcularPagamento();
    }
}
