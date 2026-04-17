package Lista04.q3;

public class Alunos extends SistemaAcademico {

    String matricula;
    String curso;
    String nome;
    String CPF;
    String email;
    double coeficienteDeRendimento;

    public Alunos(String matricula, String curso, String nome, String CPF, String email, double coeficienteDeRendimento) {
        this.matricula = matricula;
        this.curso = curso;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.coeficienteDeRendimento = coeficienteDeRendimento;
    }
}
