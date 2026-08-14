package aula.exercicio.aula5_5.Q3;

public class Quadrado implements Calculavel {

    @Override
    public void calcularArea(double lado) {
        System.out.println("A area do quadrado eh: " + (lado*lado));
    }
}
