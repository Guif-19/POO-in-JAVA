package Strings.Ativ4;

public class Funcionario {

    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String gerarEmail() {

        String[] partes = nome.split(" ");

        String primeiroNome = partes[0].toLowerCase();

        String ultimoSobrenome = partes[partes.length - 1].toLowerCase();

        return primeiroNome + "." + ultimoSobrenome + "@empresa.com.br";
    }
}
