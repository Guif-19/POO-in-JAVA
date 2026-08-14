package Strings.Ativ1;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Guilherme", "gui@gmail.com");

        Cliente c2 = new Cliente("Jao", "jaogmail.com");

        Cliente c3 = new Cliente("Javeiro", "javeiro@gmail.con");

        System.out.println("Cliente 1: " + c1.validarEmail());

        System.out.println("Cliente 2: " + c2.validarEmail());

        System.out.println("Cliente 3: " + c3.validarEmail());
    }
}
