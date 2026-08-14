package Lista06.Q13;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4, 5, 4, 3);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
    }
}