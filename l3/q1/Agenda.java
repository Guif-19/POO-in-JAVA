package Lista03.q1;

public class Agenda {

        int AnoAgenda;
        int QttPessoas;
        boolean usou;
        String nomeAgenda;
        String nomeDono;

        Pessoas[] contatos;

    public Agenda(int AnoAgenda, String nomeAgenda, String nomeDono, int QttPessoas, int capacidadeMaxima) {
        this.AnoAgenda = AnoAgenda;
        this.nomeAgenda = nomeAgenda;
        this.nomeDono = nomeDono;
        this.QttPessoas = 0;
        this.usou = false;
        this.contatos = new Pessoas[capacidadeMaxima];
    };

    public void adicionarPessoas(Pessoas novaPessoas) {
        if (QttPessoas < contatos.length) {
            contatos[QttPessoas] = novaPessoas;
            QttPessoas++;
        } else {
            System.out.println("Agenda cheia");
        }
    }


    }

