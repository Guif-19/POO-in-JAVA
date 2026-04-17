package Lista04.q3;

public class Diretoria extends SistemaAcademico {

    String cargo;
    String nome;
    String sobrenome;
    String cpf;
    String AssinaturaDigital;

    public Diretoria(    String cargo, String nome, String sobrenome, String cpf, String AssinaturaDigital) {
        this.cargo = cargo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.AssinaturaDigital =  AssinaturaDigital;
    }
}
