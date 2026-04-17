package Lista04.q3;

public class Docentes extends SistemaAcademico {

    String nome;
    String CPF;
    String email;
    String cargo;
    String siape;

    public Docentes(String nome, String CPF, String email, String cargo, String siape) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.cargo = cargo;
        this.siape = siape;
    }
}
