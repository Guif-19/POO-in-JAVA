package Lista06.Q7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();

        v1.setVelocidade(500);
        System.out.println("velocidade: " + v1.getVelocidade());

        v1.setVelocidade(200);
        System.out.println("velocidade: " + v1.getVelocidade());

        Veiculo v2 = new Veiculo();

        v2.setVelocidade(-500);
        System.out.println("velocidade: " + v2.getVelocidade());

        v2.setVelocidade(0);
        System.out.println("velocidade: " + v2.getVelocidade());

    }
}
