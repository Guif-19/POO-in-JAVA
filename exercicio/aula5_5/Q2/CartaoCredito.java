package aula.exercicio.aula5_5.Q2;

public class CartaoCredito implements FormaPagamento {

    double valor;

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$" + valor + " via Cartao de credito feito com sucesso");
    }

}
