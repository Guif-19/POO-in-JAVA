package aula.exercicio.aula5_5.Q4;

public class EntregaDrone implements Entrega{
    //R$ 12,00 fixo + R$ 3,50 por quilômetro.

    @Override
    public double calcularFrete(double distancia){
        if (distancia>10) {
            return (15.00 + 12.00 + (distancia * 3.50));
        } else  {
            return (12.00 + (distancia * 2.50));
        }
    }

    @Override
    public String getDescricao(){
        return  "Drone";
    }
}
