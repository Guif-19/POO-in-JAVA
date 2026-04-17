package Lista04.q2;

//Escreva um código em Java que apresente a classe Pessoa, com atributos nome,
//endereço e telefone e, o metodo imprimir. O metodo imprimir deve mostrar na
//tela os valores de todos os atributos.

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    void imprimir(String nome, String endereco, String telefone){
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
    }
}
