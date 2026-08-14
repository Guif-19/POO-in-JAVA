package Lista06.Q7;

public class Veiculo {

    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0 && velocidade <= 200) {
            this.velocidade = velocidade;
        } else {
            System.out.println("O velocidade deve ser entre 0 e 200");
        }
    }


}
