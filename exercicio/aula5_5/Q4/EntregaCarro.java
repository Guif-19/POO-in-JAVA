package aula.exercicio.aula5_5.Q4;

import aula.exercicio.Carro;

public class EntregaCarro implements Entrega {
    //R$ 8,00 fixo + R$ 2,00 por quilômetro.

    @Override
    public double calcularFrete(double distancia){
        return (8.00+(distancia*2.00));
    }

    @Override
    public String getDescricao(){
        return  "Carro";
    }
}
