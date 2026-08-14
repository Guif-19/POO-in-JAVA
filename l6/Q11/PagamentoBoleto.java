package Lista06.Q11;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public void processar(double valor){
        System.out.println("Pagamento no boleto emitido com sucesso no valor de: " + valor);
    }
}
