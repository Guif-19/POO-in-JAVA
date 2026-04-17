package Lista02;

import java.util.Scanner;

public class KmH {
    public static void main(String[] arg){

        double km, hora, Vmedia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Percorreu quantos Km? ");
        km = scanner.nextDouble();
        System.out.println("Em quantas horas? ");
        hora = scanner.nextDouble();

        Vmedia = km/(hora);

        System.out.println("Velocidade mediaa de: " + Vmedia + ".");

        scanner.close();
    }
}
