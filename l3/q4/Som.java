package Lista03.q4;

public class Som {
    int potencia;
    int volume;

    public Som(int potencia) {
        this.potencia = potencia;
        this.volume = 10;
    }

    public void aumentarVolume(){
        if (volume < 100){
            volume++;
            System.out.println("Volume: " + volume);
        }else {
            System.out.println("Volume maximo atingido");
        }
    }

    public int getPotencia() {
        return potencia;
    }

}
