package aula.exercicio.aula5_5.Q4;

public class Main {
    public static void main(String[] args) {
        double distanciaTeste = 12.0;
        ProcessadorEntrega processador = new ProcessadorEntrega();

        Entrega[] entregas = {
                new EntregaMoto(),
                new EntregaCarro(),
                new EntregaDrone()
        };

        for (Entrega e : entregas) {
            processador.processar(e, distanciaTeste);
        }
    }
}