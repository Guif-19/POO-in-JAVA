package com.ufv.locadora.model;

public class Caminhonete extends Veiculo{

    private int capacidadeCargaKg;
    private int numeroPortas;
    private String tipoCombustivel;

    public Caminhonete(String placa, String marca, String modelo, int ano,
                 double valorDiaria, int numeroPortas, String tipoCombustivel, int capacidadeCargaKg) {
        super(placa, marca, modelo, ano, valorDiaria);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    /** Carros são cobrados pelo valor cheio da diária. */
    @Override
    public double calcularCustoLocacao(int numeroDias) {
        return getValorDiaria() * numeroDias * 1.25;
    }

    @Override
    public String getTipoVeiculo() {
        return "CAMINHONETE";
    }

    public int getNumeroPortas() { return numeroPortas; }

    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    public String getTipoCombustivel() { return tipoCombustivel; }

    public void setTipoCombustivel(String tipoCombustivel) { this.tipoCombustivel = tipoCombustivel; }

    public int getCapacidadeCargaKg() {return capacidadeCargaKg; }

    public void setCapacidadeCargaKg(int capacidadeCargaKg){
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | %d portas | %s", numeroPortas, tipoCombustivel);
    }

}
