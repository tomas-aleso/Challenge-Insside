package com.tomasaleso.challengeinsside.telefono;

import java.math.BigDecimal;

public class Telefono {
    private String marca;
    private String modelo;
    private BigDecimal precio;
    private String codigo;

    public Telefono(String marca, String modelo, String precio, String codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = new BigDecimal(precio);
        this.codigo = codigo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPrecio() {
        return this.precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "{" +
                " marca='" + getMarca() + "'" +
                ", modelo='" + getModelo() + "'" +
                ", precio='" + getPrecio() + "'" +
                ", codigo='" + getCodigo() + "'" +
                "}";
    }

}
