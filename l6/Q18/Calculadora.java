package Lista06.Q18;

public class Calculadora {

    private double a, b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double dividir(double a, double b) throws DivisaoPorZeroException{
        if (b == 0) {
            throw new DivisaoPorZeroException("Nao se deve fazer divisao por zero, ecolha outro numero para o denominador.");
        } else {
            return a / b;
        }
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
}
