package Java_Collections_Framework.Bloco5.Q17;

public class Livro {

    private String isbn;
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String isbn,
                 String titulo,
                 String autor,
                 int ano) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {

        return titulo +
                " | " +
                autor +
                " | " +
                ano +
                " | ISBN: " +
                isbn;
    }
}
