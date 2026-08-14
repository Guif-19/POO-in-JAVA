package Lista06.Q16;

public class Main {

    public static void main(String[] args) {

        Pagavel[] pagamentos = {
                new FuncionarioFixo(3481.14159),
                new Freelancer(30, 52)
        };

        for (Pagavel p : pagamentos) {
            System.out.println(p);
        }
    }

}
