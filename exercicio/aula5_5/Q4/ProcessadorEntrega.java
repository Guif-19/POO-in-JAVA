package aula.exercicio.aula5_5.Q4;

public class ProcessadorEntrega{

    public void processar(Entrega entrega, double distancia) {
        double valor = entrega.calcularFrete(distancia);
        System.out.println("Entrega de " + entrega.getDescricao() + ", distância: " + distancia + " km e Total: R$" + valor + ".");
    }
}