package Java_Collections_Framework.Bloco3.Q9;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> agenda = new TreeMap<>();

        int opcao;

        do {

            System.out.println("\n=== AGENDA TELEFÔNICA ===");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Remover contato");
            System.out.println("4 - Listar contatos");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    if (agenda.containsKey(nome)) {

                        System.out.println("Contato já existe.");
                        System.out.print("Deseja sobrescrever? (s/n): ");

                        String resposta = sc.nextLine();

                        if (resposta.equalsIgnoreCase("s")) {
                            agenda.put(nome, telefone);
                            System.out.println("Contato atualizado.");
                        }

                    } else {

                        agenda.put(nome, telefone);
                        System.out.println("Contato adicionado.");
                    }

                    break;

                case 2:

                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();

                    if (agenda.containsKey(nome)) {
                        System.out.println("Telefone: "
                                + agenda.get(nome));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }

                    break;

                case 3:

                    System.out.print("Nome para remover: ");
                    nome = sc.nextLine();

                    if (agenda.remove(nome) != null) {
                        System.out.println("Contato removido.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }

                    break;

                case 4:

                    System.out.println("\n=== CONTATOS ===");

                    for (String chave : agenda.keySet()) {

                        System.out.println(
                                chave + " -> "
                                        + agenda.get(chave)
                        );
                    }

                    break;

                case 0:

                    System.out.println("Encerrando...");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}