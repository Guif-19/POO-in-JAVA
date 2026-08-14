package Lista06.Q2;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Arroz", 20.50, 20);
        Produto p2 = new Produto("Papel", 0.50, 100);

        p1.calcularPreco();
        p2.calcularPreco();

        System.out.println(p1);
        System.out.println(p2);
    }
}
