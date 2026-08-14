package Lista06.Q11;

public class Main {
    public static void main(String[] args) {

        PagamentoCartao pagamentoCartao = new PagamentoCartao(500);
        PagamentoPix pagamentoPix = new PagamentoPix(400);
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto(300);

        pagamentoCartao.processar(500);
        pagamentoPix.processar(400);
        pagamentoBoleto.processar(300);

    }
}
