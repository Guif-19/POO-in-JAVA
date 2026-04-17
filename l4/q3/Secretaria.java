package Lista04.q3;

public class Secretaria extends SistemaAcademico {

    String nome;
    String sobrenome;
    String cpf;
    String cargo;
    String telefone;
    String setorResponsavel;

    public Secretaria(String nome, String sobrenome, String cpf, String cargo, String telefone,  String setorResponsavel) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.telefone = telefone;
        this.setorResponsavel = setorResponsavel;
    }

}
