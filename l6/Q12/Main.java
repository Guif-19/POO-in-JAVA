package Lista06.Q12;

public class Main {
    public static void main(String[] args) {

        Veiculo[] veiculos = {
                new Carro(),
                new Moto(),
                new Caminhao()
        };

        for (Veiculo v : veiculos) {
            System.out.println("Custo da locacao de" + v + " por 5 dias = " + v.calcularCustoLocacao(5));
        }

    }
}