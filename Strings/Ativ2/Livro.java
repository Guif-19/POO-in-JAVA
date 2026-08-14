package Strings.Ativ2;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String busca;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    Scanner ler = new Scanner(System.in);

    public boolean buscarTitulo(){
        System.out.print("Digite o titulo do livro: ");
        busca = ler.nextLine();
        //        if (busca.contains(getTitulo())) {
        //            return true;
        //        } else {
        //            return false;
        //        }
        return getTitulo().contains(busca);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + '}';
    }

}
