package aula.exercicio.aula5_5.Q3;

public class Circulo implements Calculavel {

    @Override
    public void calcularArea(double lado) {
        System.out.println("A area do circulo eh ~= " + (3.14 * lado));
    }

}
