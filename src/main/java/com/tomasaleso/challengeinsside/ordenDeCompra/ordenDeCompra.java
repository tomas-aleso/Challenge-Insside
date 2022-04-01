package com.tomasaleso.challengeinsside.ordenDeCompra;

import java.util.List;

import com.tomasaleso.challengeinsside.ChallengeInssideApplication;
import com.tomasaleso.challengeinsside.cliente.Cliente;
import com.tomasaleso.challengeinsside.telefono.Telefono;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class ordenDeCompra {
    private List<Telefono> telefonos;
    private Cliente cliente;
    private LocalDateTime fecha;
    private int numero;
    private BigDecimal total;

    public ordenDeCompra(List<String> codigoTelefonos, int clienteDNI, int numero) {

        this.telefonos = ChallengeInssideApplication.telefonos.stream()
                .filter(telefono -> codigoTelefonos.stream()
                        .anyMatch(codigo -> codigo.equals(telefono.getCodigo())))
                .collect(Collectors.toList());
        this.cliente = ChallengeInssideApplication.clientes.stream()
                .filter(cliente -> cliente.getDni() == clienteDNI)
                .findFirst().orElseThrow();
        this.fecha = LocalDateTime.now();
        this.numero = numero;
        this.total = telefonos.stream().reduce(new BigDecimal(0),
                (subtotal, telefono) -> subtotal.add(telefono.getPrecio()), BigDecimal::add);
    }

    public List<Telefono> getTelefonos() {
        return this.telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "{" +
                " telefonos='" + getTelefonos() + "'" +
                ", cliente='" + getCliente() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", numero='" + getNumero() + "'" +
                ", total='" + getTotal() + "'" +
                "}";
    }

}
