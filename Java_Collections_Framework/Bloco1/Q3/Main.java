package Java_Collections_Framework.Bloco1.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

import static Java_Collections_Framework.Bloco1.Q3.Produto.maiorCem;

public class Main {
    public static void main(String[] args) {
        List <Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(1, "Mouse", 50.0));
        produtos.add(new Produto(2, "Teclado", 120.0));
        produtos.add(new Produto(3, "Monitor", 900.0));
        produtos.add(new Produto(4, "Headset", 200.0));
        produtos.add(new Produto(5, "Webcam", 150.0));
        produtos.add(new Produto(6, "Notebook", 3500.0));

        System.out.println("Produto: "  + produtos);

        Main main = maiorCem(produtos);
        System.out.println(main);


        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getPreco() > 100){
                System.out.println(produtos.get(i));
            }
        }

        Collections.sort(produtos, Comparator.comparing(Produto::getPreco));
        System.out.println("Produto: "  + produtos);

        Collections.sort(produtos, Comparator.comparing(Produto::getNome));
        System.out.println("Produto: "  + produtos);

        Collections.reverse(produtos);
        System.out.println("Produto: "  + produtos);
    }
}
