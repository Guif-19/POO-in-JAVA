package Lista06.Q3;

public class Quarto {

    private int numero;
    private String tipo;
    private double precoPorNoite;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
    }

    public int getNumero() {
        return numero;
    }
    public String getTipo() {
        return tipo;
    }
    public double getPrecoPorNoite(){
        return precoPorNoite;
    }
    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", tipo: " + tipo + ", custo por noite: " +  precoPorNoite;
    }
}
