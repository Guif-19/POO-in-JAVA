package Aula_19_05;

class Paciente extends Pessoa {

    private int idadeAnos;
    private char tipoSanguineo;
    private boolean gestante;
    private int numeroSenha;

    public Paciente(String nome, String cpf, int idadeAnos, char tipoSanguineo, boolean gestante, int numeroSenha) {
        super(nome, cpf);
        this.idadeAnos = idadeAnos;
        this.gestante = gestante;
        this.numeroSenha = numeroSenha;

        // Armadilha #1: tipoSanguineo == 'X' representa tipo desconhecido, não inválido. O sistema deve aceitá-lo normalmente.
        if (tipoSanguineo != 'A' && tipoSanguineo != 'B' && tipoSanguineo != 'O' && tipoSanguineo != 'X') {
            throw new IllegalArgumentException("Tipo sanguíneo inválido. Use A, B, O ou X maiúsculos.");
        }
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getIdadeAnos() { return idadeAnos; }
    public char getTipoSanguineo() { return tipoSanguineo; }
    public boolean isGestante() { return gestante; }
    public int getNumeroSenha() { return numeroSenha; }

    public void setIdadeAnos(int idadeAnos) {
        this.idadeAnos = idadeAnos;
    }
    public void setTipoSanguineo(char tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    public void setGestante(boolean gestante) {
        this.gestante = gestante;
    }
    public void setNumeroSenha(int numeroSenha) {
        this.numeroSenha = numeroSenha;
    }


    @Override
    public String identificacao() {
        return "[" + numeroSenha + "] " + getNome() + " (tipo: " + tipoSanguineo + ")";
    }
}
