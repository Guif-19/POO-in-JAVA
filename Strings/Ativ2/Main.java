package Strings.Ativ2;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Introdução à Programação Java");

        if (l1.buscarTitulo()){
            System.out.println("Titulo encontrado");
        }else {
            System.out.println("Titulo nao encontrado");
        }
    }
}
