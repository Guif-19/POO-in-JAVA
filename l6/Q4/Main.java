package Lista06.Q4;

public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria("Guilherme", 67, 2000000000);
        ContaBancaria c2 = new ContaBancaria("Renan", 69, -1000);

        c1.exibirSaldo();
        c2.exibirSaldo();

    }
}
