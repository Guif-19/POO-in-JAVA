package aula.exercicio;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private int matricula, i, total;
    private double[] notas = new double[0];

    Scanner scanner = new Scanner(System.in);

    public int calcularMedia(){
        System.out.println("Digite quantas notas o aluno serao digitadas: ");
        int qtdNotas = scanner.nextInt();
        if (qtdNotas <= 0){
            System.out.println("Digite um numero maior que 0. ");
        }else if (qtdNotas > 0) {
            notas = new double[qtdNotas];
            for (i = 0; i < qtdNotas; i++) {
                System.out.println("Digite a nota do aluno: ");
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Digite um valor entre 0 e 10.");
                }else {
                    notas[i] = scanner.nextInt();
                    total += notas[i];
                }
            }
        }
        System.out.println("A media do aluno eh: ");
        return total / qtdNotas;
    }
}
