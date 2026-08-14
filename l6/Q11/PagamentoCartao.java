package Lista06.Q11;

public class PagamentoCartao extends Pagamento{

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public void processar(double valor){
        System.out.println("Pagamento no cartao emitido com sucesso no valor de: " + (valor*1.02));
    }
}
