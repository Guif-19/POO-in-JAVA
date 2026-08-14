package Strings.Ativ5;

public class Main {

    public static void main(String[] args) {

        Senha s1 = new Senha("Gui_1234");
        Senha s2 = new Senha("gui_1234");
        Senha s3 = new Senha("Gui");
        Senha s4 = new Senha("Guiiiiiiiii");

        System.out.println(s1.validar());
        System.out.println(s2.validar());
        System.out.println(s3.validar());
        System.out.println(s4.validar());
    }
}