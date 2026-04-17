package Lista03.q4;

public class Main {
    public static void main(String[] args) {

        Controle controle = new Controle("Infra-vermelho");
        Antena antena = new Antena("Claro");
        Som som = new Som(40);

        Televisao tv = new Televisao(som, antena, controle);

        tv.aumentarVolume();

        tv.ligar();
        tv.aumentarVolume();

        tv.exibirEspecificcoes();
    }
}
