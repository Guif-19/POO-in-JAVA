package Java_Collections_Framework.Bloco2.Q5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();
        emails.add("a@mail.com");
        emails.add("b@mail.com");
        emails.add("c@mail.com");
        emails.add("d@mail.com");
        emails.add("e@mail.com");
        emails.add("a@mail.com");
        emails.add("b@mail.com");
        emails.add("a@mail.com");
        emails.add("5@mail.com");
        emails.add("b@mail.com");

        Set<String> hashSet = new HashSet<>(emails);
        //Remove duplicatas, mas a ordem é imprevisível.

        Set<String> treeSet = new TreeSet<>(emails);
        //Remove duplicatas e ordena automaticamente.

        Set<String> linkedHashSet = new LinkedHashSet<>(emails);
        //Remove duplicatas e mantém a ordem de inserção.

        System.out.println("Lista original:");
        System.out.println(emails);

        System.out.println("\nHashSet:");
        System.out.println(hashSet);

        System.out.println("\nLinkedHashSet:");
        System.out.println(linkedHashSet);

        System.out.println("\nTreeSet:");
        System.out.println(treeSet);

    }
}
