package Lista03.q4;

public class Televisao {
    Som som;
    Antena antena;
    Controle controle;
    boolean isLigada;

    public Televisao(Som som, Antena antena, Controle controle) {
        this.controle = controle;
        this.antena = antena;
        this.som = som;
        this.isLigada = false;
    }

    public void ligar() {
        this.isLigada = true;
        System.out.println("Televisao Ligada");
    }

    public void aumentarVolume() {
        if (this.isLigada) {
            this.som.aumentarVolume();
        } else {
            System.out.println("Volume máximo atingido");
        }
    }

    public void exibirEspecificcoes(){
        System.out.println("-Especificacoes TV");
        System.out.println("Controle: " + controle.getModelo());
        System.out.println("Potencia do som: " + som.getPotencia());
        System.out.println("Antena: " + antena.getTipo());
    }
}
