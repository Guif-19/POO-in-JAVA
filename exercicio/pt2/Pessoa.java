package Aula_19_05;

import java.util.ArrayList;
import java.util.List;

abstract class Pessoa {
    private String nome;
    private String cpf;

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    abstract String identificacao();
}
