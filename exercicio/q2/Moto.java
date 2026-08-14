package aula.exercicio.q2;

class Moto extends Veiculo {

    public Moto(String modelo, double valorTabela) {
        super(modelo, valorTabela);
    }

    @Override
    public double calcularIPVA() {
        return this.valorTabela * 0.02; // 2%
    }
}