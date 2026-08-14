package Lista06.Q10;

public class Passaro extends Animal {

    public Passaro(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("O passaro piou");
    }
}