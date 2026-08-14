package Java_Collections_Framework.Bloco1.Q2;

import java.util.ArrayList;
import java.util.List;

import static Java_Collections_Framework.Bloco1.Q2.Notas.*;

public class NotasMedia {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        notas.add(1.0);
        notas.add(2.0);
        notas.add(3.0);
        notas.add(4.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);

        double notaMedia = calcularMedia(notas);
        System.out.println("Media: " + notaMedia);

        double ma = maiorNota(notas);
        System.out.println("Nota maior: " + ma);
        double me = menorNota(notas);
        System.out.println("Nota menor: " + me);
        contarAprovados(notas);

    }
}
