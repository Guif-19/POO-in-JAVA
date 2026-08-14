package Strings.Ativ5;

public class Senha {

    private String senha;

    public Senha(String senha) {
        this.senha = senha;
    }

    public boolean validar() {

        boolean temMaiuscula = false;
        boolean temNumero = false;

        if (senha.length() < 8) {
            return false;
        }

        for (int i = 0; i < senha.length(); i++) {

            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            if (Character.isDigit(c)) {
                temNumero = true;
            }
        }

        return temMaiuscula && temNumero;
    }
}
