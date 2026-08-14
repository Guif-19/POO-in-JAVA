package Strings.Ativ3;

import java.util.Scanner;

public class Postagem {
    String Post;

    public Postagem(String Post) {
        if (Post.length()<=280){
        this.Post = Post;
    } else {
            System.out.println("Limite maximo de 280 caracteres");
        }
    }

    public String toString() {
        return Post;
    }
}
