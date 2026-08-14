package Lista06.Q10;

public class Animal {

    private String nome;
    private String especie;
    private int idade;

    public void emitirSom(){
        System.out.println("Som emitido");
    }

    public Animal(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

}
