package Lista06.Q11;

public class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }
    public void processar(double valor){
        System.out.println("Pagamento emitido com sucesso");
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
