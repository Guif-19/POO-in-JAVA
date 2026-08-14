package Lista06.Q10;

public class Gato extends Animal {

    public Gato(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("O gato miou");
    }
}
