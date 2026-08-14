package aula.exercicio.aula5_5.Q4;

public class EntregaMoto implements Entrega{
    //EntregaMoto: R$ 5,00 fixo + R$ 1,50 por quilômetro

    @Override
    public double calcularFrete(double distancia){
        return (5.00+(distancia*1.50));
    }

    @Override
    public String getDescricao(){
        return  "Moto";
    }
}
