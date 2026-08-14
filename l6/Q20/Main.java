package Lista06.Q20;

import Lista06.Q19.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();

        try {
            c1.setCpf("12");
        } catch (CpfInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            c1.setIdade(-12);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            c1.setNome("12");
        } catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
