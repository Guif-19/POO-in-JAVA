package aula.exercicio.q2;

class Carro extends Veiculo {

    public Carro(String modelo, double valorTabela) {
        super(modelo, valorTabela);
    }

    @Override
    public double calcularIPVA() {
        return this.valorTabela * 0.04; // 4%
    }
}
