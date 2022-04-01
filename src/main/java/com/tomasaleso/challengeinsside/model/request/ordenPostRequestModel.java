package com.tomasaleso.challengeinsside.model.request;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ordenPostRequestModel {
    @NotNull List<String> codigosTelefonos;
    @Min(1) int clienteDNI;
    @Min(1) int numeroDeOrden;

    public ordenPostRequestModel(List<String> codigosTelefonos, int clienteDNI, int numeroDeOrden) {
        this.codigosTelefonos = codigosTelefonos;
        this.clienteDNI = clienteDNI;
        this.numeroDeOrden = numeroDeOrden;
    }

    public List<String> getCodigosTelefonos() {
        return this.codigosTelefonos;
    }

    public void setCodigosTelefonos(List<String> codigosTelefonos) {
        this.codigosTelefonos = codigosTelefonos;
    }

    public int getClienteDNI() {
        return this.clienteDNI;
    }

    public void setClienteDNI(int clienteDNI) {
        this.clienteDNI = clienteDNI;
    }

    public int getNumeroDeOrden() {
        return this.numeroDeOrden;
    }

    public void setNumeroDeOrden(int numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

}
