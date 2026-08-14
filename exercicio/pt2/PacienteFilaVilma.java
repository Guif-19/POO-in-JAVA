package Aula_19_05;

class PacienteFilaVilma extends Paciente implements Prioritario {

    public PacienteFilaVilma(String nome, String cpf, int idadeAnos, char tipoSanguineo, boolean gestante, int numeroSenha) {
        super(nome, cpf, idadeAnos, tipoSanguineo, gestante, numeroSenha);
    }

    @Override
    public int calcularPeso() {

        int peso = 0;

        if (this.getIdadeAnos() > 60) {
            peso += 10;
        }
        if (this.getIdadeAnos() < 12) {
            peso += 7;
        }

        // Armadilha #3: Os bônus são aditivos (exceto a substituição gestante/menor). Uma gestante menor de 18 com tipo O e 3º dígito par acumula: 25 + 5 + 3 = 33.
        if (this.isGestante()) {
            if (this.getIdadeAnos() >= 18) {
                peso += 15;
            } else {
                peso += 25;
            }
        }

        if (this.getTipoSanguineo() == 'O') {
            peso += 5;
        }

        if (this.getCpf() != null && this.getCpf().length() == 11) {
            char terceiroDigito = this.getCpf().charAt(2);
            if (terceiroDigito == '0' || terceiroDigito == '2' ||
                    terceiroDigito == '4' || terceiroDigito == '6' || terceiroDigito == '8') {
                peso += 3;
            }
        }

        return peso;
    }
}
