package Lista06.Q11;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void processar(double valor){
        System.out.println("Pagamento no pix emitido com sucesso no valor de: " + valor);
    }
}
