package Aula_19_05;

import java.util.ArrayList;
import java.util.List;

class FilaAtendimento {

    private List<PacienteFilaVilma> fila = new ArrayList<>();

    public void entrar(PacienteFilaVilma p) {
        fila.add(p);
    }

    public int tamanho() {
        return fila.size();
    }

    public PacienteFilaVilma chamarProximo() {
        // Armadilha #2: chamarProximo() em fila vazia deve lançar IllegalStateException com a mensagem "Fila vazia" — não retornar null.
        if (fila.isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }

        int indiceMaisPrioritario = 0;
        PacienteFilaVilma pacienteMaisPrioritario = fila.get(0);

        for (int i = 1; i < fila.size(); i++) {
            PacienteFilaVilma atual = fila.get(i);

            int pesoAtual = atual.calcularPeso();
            int maiorPesoAteAgora = pacienteMaisPrioritario.calcularPeso();

            if (pesoAtual > maiorPesoAteAgora) {
                pacienteMaisPrioritario = atual;
                indiceMaisPrioritario = i;
            }
            else if (pesoAtual == maiorPesoAteAgora) {
                if (atual.getNumeroSenha() < pacienteMaisPrioritario.getNumeroSenha()) {
                    pacienteMaisPrioritario = atual;
                    indiceMaisPrioritario = i;
                }
            }
        }

        return fila.remove(indiceMaisPrioritario);
    }
}