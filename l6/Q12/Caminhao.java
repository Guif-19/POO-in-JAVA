package Lista06.Q12;

class Caminhao extends Veiculo {

    public double calcularCustoLocacao(int dias) {
        return dias * 200;
    }

    @Override
    public String toString() {
        return " Caminhao";
    }
}
