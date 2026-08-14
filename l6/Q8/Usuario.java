package Lista06.Q8;

public class Usuario {

    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String setSenha(@org.jetbrains.annotations.NotNull String senha) {
        if (senha.length() < 8) {
            System.out.println("Digite uma senha com pelo menos 8 caracteres");
        }
        return senha;
    }

}
