package Lista06.Q10;

public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Doka", "Vira-lata com vira lixo", 7);
        Gato g1 = new Gato("Tom", "Vira-lixo", 4);
        Passaro p1 = new Passaro("Amarelao", "Trinca-ferro", 2);

        c1.emitirSom();
        g1.emitirSom();
        p1.emitirSom();

    }
}
