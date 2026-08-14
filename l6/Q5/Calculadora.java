package Lista06.Q5;

public class Calculadora {
    private double lado;
    private double base;
    private double altura;
    private boolean isTriangulo;

    public Calculadora(double lado) {
        this.lado = lado;
    }

    public Calculadora(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Calculadora(double base, double altura,  boolean isTriangulo) {
        this.base = base;
        this.altura = altura;
        this.isTriangulo = isTriangulo;
    }

    public double CalcularArea(double lado) {
        return (lado*lado);
    }

    public double CalcularArea(double base, double altura) {
        return (base*altura);
    }
    public double CalcularArea(double base, double altura,  boolean isTriangulo) {
        return ((base*altura)/2);
    }



    public void setLado(double lado) {
        this.lado = lado;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setIsTriangulo(boolean isTriangulo) {
        this.isTriangulo = isTriangulo;
    }
    public double getLado() {
        return lado;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public boolean isTriangulo() {
        return isTriangulo;
    }



}
