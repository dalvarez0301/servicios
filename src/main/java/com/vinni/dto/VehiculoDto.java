package com.vinni.dto;

public class VehiculoDto {
    private String placa;
    private String marca;
    private int modelo;
    private long precio;
    private double valorSeguroSoat = 90000;
    private double seguroTodoRiesgo = 350000;

    public VehiculoDto() {
    }

    public VehiculoDto(String placa, String marca, int modelo, long precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    // obtener valor seguro soat
    public double getValorSeguroSoat() {
        return this.valorSeguroSoat * 0.19 + this.valorSeguroSoat;
    }

    // obtener seguro todo riesgo
    public double getSeguroTodoRiesgo() {
        return this.seguroTodoRiesgo * 0.19 + this.seguroTodoRiesgo;
    }

}
