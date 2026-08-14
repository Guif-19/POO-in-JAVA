package Java_Collections_Framework.Bloco2.Q7;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("123", "João"));
        usuarios.add(new Usuario("123", "Maria"));

        System.out.println(usuarios);
    }

}
