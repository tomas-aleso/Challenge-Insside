package com.tomasaleso.challengeinsside.cliente;

public class Cliente {

    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String apellido, int dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", apellido='" + getApellido() + "'" +
                ", dni='" + getDni() + "'" +
                ", direccion='" + getDireccion() + "'" +
                ", telefono='" + getTelefono() + "'" +
                "}";
    }

}
