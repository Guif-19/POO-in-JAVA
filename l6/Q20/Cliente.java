package Lista06.Q20;

public class Cliente {

    private String nome;
    private String cpf;
    private int idade;


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) throws NomeInvalidoException{
        if(nome.length() < 3) {
            throw new NomeInvalidoException("O nome deve ter no minimo 3 caracteres.");
        }else {
            this.nome = nome;
        }
    }
    public void setIdade(int idade) throws IdadeInvalidaException{
        if(idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("A idade deve ser entre 0 e 120.");
        } else {
            this.idade = idade;
        }
    }
    public void setCpf(String cpf) throws CpfInvalidoException{
        if(cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            throw new CpfInvalidoException("O cpf deve ter exatamente 11 caracteres.");
        }
    }

}
