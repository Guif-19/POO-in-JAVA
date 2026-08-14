package Java_Collections_Framework.Bloco4.Q15;

//forma errada
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

        //Forma errada
        //List<Integer> numeros = new ArrayList<>();
        //
        //        for (int i = 1; i <= 20; i++) {
        //                numeros.add(i);
        //            }
        //
        //        System.out.println(numeros);

        //Forma certa


public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }

        System.out.println("Original:");
        System.out.println(numeros);

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {

            Integer n = it.next();

            if (n % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("\nApós remover pares:");
        System.out.println(numeros);
    }
}
