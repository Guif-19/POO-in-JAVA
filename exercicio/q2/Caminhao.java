package aula.exercicio.q2;

class Caminhao extends Veiculo {

    public Caminhao(String modelo, double valorTabela) {
        super(modelo, valorTabela);
    }

    @Override
    public double calcularIPVA() {
        return this.valorTabela * 0.015; // 1.5%
    }
}