package Lista06.Q9;

public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Ratola", "2345678191", 1500, "Queijos");
        Vendedor v1 = new Vendedor("Gatola", "12345678910", 1000, 2356);
        Estagiario e1 = new Estagiario("Cachorro Cururu", "123456789523", -2000, 52);

        System.out.println(g1);
        System.out.println(v1);
        System.out.println(e1);

    }
}
