package Java_Collections_Framework.Bloco5.Q16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(
                new Funcionario(
                        "Carlos",
                        "TI",
                        4000
                )
        );

        funcionarios.add(
                new Funcionario(
                        "Ana",
                        "RH",
                        3500
                )
        );

        funcionarios.add(
                new Funcionario(
                        "Bruno",
                        "TI",
                        5000
                )
        );

        funcionarios.add(
                new Funcionario(
                        "Daniel",
                        "Financeiro",
                        4500
                )
        );

        funcionarios.add(
                new Funcionario(
                        "Amanda",
                        "RH",
                        3800
                )
        );

        System.out.println("LISTA ORIGINAL");
        System.out.println(funcionarios);

        // Ordenação natural (nome)
        Collections.sort(funcionarios);

        System.out.println("\nORDENADO POR NOME");
        System.out.println(funcionarios);

        //Ordenar por salário

        Collections.sort(
                funcionarios,
                Comparator.comparing(
                        Funcionario::getSalario
                ).reversed()
        );

        System.out.println("\nORDENADO POR SALÁRIO");
        System.out.println(funcionarios);

        //Ordenar por Setor e depois por nome

        Collections.sort(
                funcionarios,
                Comparator.comparing(
                        Funcionario::getSalario
                ).reversed()
        );

        System.out.println("\nORDENADO POR SALÁRIO");
        System.out.println(funcionarios);
    }
}