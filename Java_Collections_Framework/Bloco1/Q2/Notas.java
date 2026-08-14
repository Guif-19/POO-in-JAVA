package Java_Collections_Framework.Bloco1.Q2;

import java.util.List;

public class Notas {

    static double calcularMedia(List<Double> notas){
        double total = 0;
        for(int i = 0; i < notas.size(); i++){
            total += notas.get(i);
        }
        return total/notas.size();
    }

    static double maiorNota(List<Double> notas){
        double maior = 0;
        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) > maior){
                maior = notas.get(i);
            }
        }
        return maior;
    }

    static double menorNota(List<Double> notas){
        double menor = 0;
        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) < menor){
                menor = notas.get(i);
            }
        }
        return menor;
    }

    static void contarAprovados(List<Double> notas){
        double total = 0;
        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) >= 6.0){
                System.out.println("O aluno na posicao [" + i + "] do vetor foi aprovado");
            }
        }
    }
}
