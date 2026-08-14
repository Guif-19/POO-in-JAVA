package Java_Collections_Framework.Bloco3.Q12;

import java.util.*;

public class Aluno {

    private String nome;
    private String curso;

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return nome;
    }
    Map<String, List<Aluno>> cursos = new HashMap<>();

}
