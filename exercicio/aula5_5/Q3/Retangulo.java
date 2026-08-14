package aula.exercicio.aula5_5.Q3;

public class Retangulo implements CalculaRetangulo {

    double lado;
    double base;

    @Override
    public void calcularArea(double base, double altura) {
        System.out.println("A area do quadrado eh: " + (base*altura));
    }

}
