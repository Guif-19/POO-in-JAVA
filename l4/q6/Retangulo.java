package Lista04.q6;

//Escreva um código em Java que apresente a classe Retangulo, com atributos
//comprimento, largura, área e perímetro e, os métodos calcularArea,
//calcularPerimetro e imprimir. Os métodos calcularArea e calcularPerimetro
//devem efetuar seus respectivos cálculos e colocar os valores nos atributos area e
//perimetro. O metodo imprimir deve mostrar na tela os valores de todos os
//atributos. Salienta-se que a área de um retângulo é obtida pela fórmula
//(comprimento * largura) e o perímetro por (2 * comprimento) + (2 * largura).

import java.util.Scanner;

public class Retangulo {

    int comprimento;
    int largura;
    int area;
    int perimetro;

    Scanner ler = new Scanner(System.in);

    int calcularArea(int largura, int comprimento, int area) {
        System.out.println("Digite o tamanho da largura: ");
        largura = ler.nextInt();
        System.out.println("Digite o tamanho do comprimento");
        comprimento = ler.nextInt();
        area = largura * comprimento;
        return area;

    }

    int calcularPerimetro(int largura, int comprimento, int perimetro) {
        System.out.println("Digite o tamanho da largura: ");
        largura = ler.nextInt();
        System.out.println("Digite o tamanho do comprimento");
        comprimento = ler.nextInt();
        perimetro = (largura*2) + (comprimento*2);
        return perimetro;
    }
}
