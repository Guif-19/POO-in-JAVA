package Lista06.Q12;

class Carro extends Veiculo {

    public double calcularCustoLocacao(int dias) {
        return dias * 80;
    }

    @Override
    public String toString() {
        return " Carro";
    }

}
