public class ContaBancaria {
    String titular;
    double saldo;

    public  ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double v){
        saldo += v;
    }
    public void ExibirSaldo(){
        System.out.println("Saldo de " + titular + " eh: " + saldo + "R$");
    }

    public static void main(String[] args){
        ContaBancaria cb = new ContaBancaria("jao", 500);
        cb.depositar(250);
        cb.ExibirSaldo();
    }
}
