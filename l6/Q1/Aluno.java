package Lista06.Q1;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private double notaFinal;

    public Aluno(String nome, String matricula, String curso, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.matricula + " " + this.curso + " " + this.notaFinal;
    }
}
