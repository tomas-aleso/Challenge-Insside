package com.tomasaleso.challengeinsside.ordenDeCompra;

import java.util.List;
import java.util.stream.Collectors;

import com.tomasaleso.challengeinsside.ChallengeInssideApplication;
import com.tomasaleso.challengeinsside.exeption.ApiRequestException;

import org.springframework.stereotype.Service;

@Service
public class ordenDeCompraService {

    public ordenDeCompra getOrdenDeCompra(int numeroDeOrden) {
        return ChallengeInssideApplication.ordenDeCompras.stream().filter(orden -> numeroDeOrden == orden.getNumero())
                .findFirst().orElseThrow(() -> new ApiRequestException("No existe la orden de compra con ese numero"));
    }

    public List<ordenDeCompra> getOrdenesDeCompra() {
        return ChallengeInssideApplication.ordenDeCompras;
    }

    public ordenDeCompra addNewOrdenDeCompra(List<String> codigosTelefonos, int clienteDNI, int numeroDeOrden) {

        if (!codigosTelefonos.stream().map(codigo -> ChallengeInssideApplication.telefonos.stream()
                .anyMatch(telefono -> telefono.getCodigo().equals(codigo))).reduce(true, Boolean::logicalAnd)) {
            throw new ApiRequestException("Codigo/s de telefono/s invalido/s");
        }

        if (ChallengeInssideApplication.clientes.stream()
                .noneMatch(cliente -> cliente.getDni() == clienteDNI)) {
            throw new ApiRequestException("No existe el cliente");
        }

        if (ChallengeInssideApplication.ordenDeCompras.stream().anyMatch(orden -> orden.getNumero() == numeroDeOrden))
            throw new ApiRequestException("Numero de orden ya existe");

        ordenDeCompra nuevaOrden = new ordenDeCompra(codigosTelefonos, clienteDNI, numeroDeOrden);
        ChallengeInssideApplication.ordenDeCompras.add(nuevaOrden);
        return nuevaOrden;
    }

    public void deleteOrdenDeCompra(int numeroDeOrden) {
        if (ChallengeInssideApplication.ordenDeCompras.stream().anyMatch(orden -> orden.getNumero() == numeroDeOrden)) {
            ChallengeInssideApplication.ordenDeCompras = ChallengeInssideApplication.ordenDeCompras.stream()
                    .filter(orden -> orden.getNumero() != numeroDeOrden).collect(Collectors.toList());
        } else
            throw new ApiRequestException("No existe una orden de compra con ese numero");
    }

}
