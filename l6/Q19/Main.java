package Lista06.Q19;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(10700);

        try {

            conta.sacar(1500);

        } catch (SaldoInsuficienteException e) {

            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }

}
