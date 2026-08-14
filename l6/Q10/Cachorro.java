package Lista06.Q10;

public class Cachorro extends Animal {

    public Cachorro(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("O cachorro latiu");
    }

}
