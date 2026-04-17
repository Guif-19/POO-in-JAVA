package Lista04.q5;

import java.util.Scanner;

//Escreva um código em Java que apresente a classe Quadrado, com atributos
//lado, area e perimetro e, os métodos calcularArea, calcularPerimetro e imprimir.
//Os métodos calcularArea e calcularPerimetro devem efetuar seus respectivos
//cálculos e colocar os valores nos atributos area e perimetro. O metodo imprimir
//deve mostrar na tela os valores de todos os atributos. Salienta-se que a área de
//um quadrado é obtida pela fórmula (lado * lado) e o perímetro por (4 * lado).

public class Quadrado {

    Scanner ler = new Scanner(System.in);

    int calcularArea(int lado, int area){
        System.out.println("Digite o valor do lado: ");
        lado = ler.nextInt();
        area = lado*lado;
        System.out.println("A area tem, em U.A. :");
        return area;
    }

    int calcularPerimetro(int lado, int perimetro){
        System.out.println("Digite o valor do lado: ");
        lado = ler.nextInt();
        perimetro = lado*4;
        System.out.println("A perimetro mede, em U.A. :");
        return perimetro;
    }

}
