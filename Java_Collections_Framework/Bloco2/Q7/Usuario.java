package Java_Collections_Framework.Bloco2.Q7;

import java.util.*;

public class Usuario {

    private String cpf;
    private String nome;

    public Usuario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "CPF: "+ cpf + "| Nome: " + nome;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Usuario usuario = (Usuario) o;

        return Objects.equals(cpf, usuario.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

}
