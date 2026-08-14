package Lista06.Q5;

public class Main {
    public static void main(String[] args) {

        Calculadora quad = new Calculadora(5.0);
        Calculadora ret = new Calculadora(5.0, 10.0);
        Calculadora tri = new Calculadora(5.0, 10.0, true);

        //quad.CalcularArea(5.0);
        //ret.CalcularArea(5.0, 10.0);
        //tri.CalcularArea(5.0, 10.0, true);

        System.out.println(quad.CalcularArea(5.0));
        System.out.println(ret.CalcularArea(5.0, 10.0));
        System.out.println(tri.CalcularArea(5.0, 10.0, true));
    }
}
