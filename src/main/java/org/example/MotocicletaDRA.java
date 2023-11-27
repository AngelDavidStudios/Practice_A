package org.example;

public class MotocicletaDRA {

    private String placa;
    private String marca;
    private int anio;
    private String tipo;

    public MotocicletaDRA(String placa, String marca, int anio, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.tipo = tipo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAnio() {
        return this.anio;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String toString() {
        return "Placa: " + this.placa + 
                "\n \tMarca: " + this.marca +
                "\n \tAño: " + this.anio +
                "\n \tTipo: " + this.tipo;
    }
}
