package Lista06.Q19;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Nao foi possivel sacar, tente um valor menor.");
        }

        saldo -= valor;
        System.out.println("Valor sacado: " + valor);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
