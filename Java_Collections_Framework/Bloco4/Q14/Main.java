package Java_Collections_Framework.Bloco4.Q14;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static boolean balanceado(String expressao) {

        Deque<Character> pilha = new ArrayDeque<>();

        for (int i = 0; i < expressao.length(); i++) {

            char c = expressao.charAt(i);

            // abertura
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            }

            // fechamento
            else if (c == ')' || c == ']' || c == '}') {

                if (pilha.isEmpty()) {
                    return false;
                }

                char topo = pilha.pop();

                if (c == ')' && topo != '(') {
                    return false;
                }

                if (c == ']' && topo != '[') {
                    return false;
                }

                if (c == '}' && topo != '{') {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(
                balanceado("(a+b)*(c-d)")
        );

        System.out.println(
                balanceado("(a+b]*(c-d)")
        );

        System.out.println(
                balanceado("{[(a+b)]}")
        );
    }
}