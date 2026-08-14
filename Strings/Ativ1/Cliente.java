package Strings.Ativ1;

public class Cliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public boolean validarEmail() {

        if (email.contains("@") && email.contains(".com")) {
            return true;
        }
        System.out.println("Email invalido, verifique se o seu email possui '@' e '.com' !");
        return false;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
