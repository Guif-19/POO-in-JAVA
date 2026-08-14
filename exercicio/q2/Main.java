package aula.exercicio.q2;

public class Main {
    public static void main(String[] args) {

        Veiculo[] frota = {
                new Carro("Toyota Corolla", 150000),
                new Moto("Honda CB 500", 40000),
                new Caminhao("Volvo FH", 550000)
        };

        double totalSoma = 0;

        for (Veiculo v : frota) {
            double valorIPVA = v.calcularIPVA();
            totalSoma += valorIPVA;

            System.out.println("Veículo: " + v.modelo + " | IPVA: R$ " + valorIPVA);
        }

        System.out.println("Total de IPVA da frota: R$ " + totalSoma);
    }
}