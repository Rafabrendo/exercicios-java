package modelo;

import java.io.Serializable;

public class Guarita implements Serializable{

    
    private int numero;
    private int veiculos;
    private Praca praca;
    private Double valorRecebido;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVeiculos() {
        return this.veiculos;
    }

    public void setVeiculos(int veiculos) {
        this.veiculos = veiculos;
    }

    public Praca getPraca() {
        return this.praca;
    }

    public void setPraca(Praca praca) {
        this.praca = praca;
    }

    public Double getValorRecebido() {
        return this.valorRecebido;
    }

    public void setValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
    
}
