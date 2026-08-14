package Lista06.Q12;

class Moto extends Veiculo {

    public double calcularCustoLocacao(int dias) {
        return dias * 50;
    }

    @Override
    public String toString() {
        return " Moto";
    }

}
