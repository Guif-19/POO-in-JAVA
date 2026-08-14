package Aula_19_05;

public class Main {
    public static void main(String[] args) {

        FilaAtendimento fila = new FilaAtendimento();

        PacienteFilaVilma pacienteA = new PacienteFilaVilma("Sr. Frncisco", "12456789012", 65, 'O', false, 101);
        PacienteFilaVilma pacienteB = new PacienteFilaVilma("Maria Faria", "11156789012", 12, 'A', true, 102);
        PacienteFilaVilma pacienteC = new PacienteFilaVilma("Enzo", "12356789012", 8, 'X', false, 103);
        PacienteFilaVilma pacienteD = new PacienteFilaVilma("Wendel Bezerra", "12556789012", 30, 'B', false, 104);

        fila.entrar(pacienteD);
        fila.entrar(pacienteA);
        fila.entrar(pacienteC);
        fila.entrar(pacienteB);

        System.out.println("Início do Atendimento:");
        System.out.println("Tamanho inicial da fila: " + fila.tamanho());

        while (fila.tamanho() > 0) {
            PacienteFilaVilma proximo = fila.chamarProximo();
            System.out.println("Chamando: " + proximo.identificacao());
            System.out.println("Peso (Prioridade): " + proximo.calcularPeso());
        }

        try {
            fila.chamarProximo();
        } catch (IllegalStateException e) {
            System.out.println("Erro capturado ao tentar chamar em fila vazia: " + e.getMessage());
        }
    }
}
