package aula.exercicio;

import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo, deposito, saque;

    Scanner scanner = new Scanner(System.in);

    public double depositar() {
        System.out.println("Qual valor deseja depositar?");
        deposito = scanner.nextDouble();
        saldo += deposito;
        System.out.println("Saldo atual: ");
        return saldo;
    }

    public double sacar() {
        if (deposito > saldo) {
            System.out.println("Saldo insuficiente");
        }else {
            saldo -= deposito;
        }
        System.out.println("Saldo atual: ");
        return saldo;
    }

}
