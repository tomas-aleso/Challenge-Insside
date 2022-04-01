package com.tomasaleso.challengeinsside.ordenDeCompra;

import java.util.List;

import javax.validation.Valid;

import com.tomasaleso.challengeinsside.model.request.ordenPostRequestModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.http.HttpStatus;

@RestController
@Validated
@RequestMapping(path = "api/orden-de-compra")
public class ordenDeCompraController {

    private final ordenDeCompraService ordenDeCompraService;

    @Autowired
    public ordenDeCompraController(ordenDeCompraService ordenDeCompraService) {
        this.ordenDeCompraService = ordenDeCompraService;
    }

    @GetMapping("/{numeroDeOrden}")
    public ordenDeCompra getOrdenDeCompra(@PathVariable int numeroDeOrden) {
        return ordenDeCompraService.getOrdenDeCompra(numeroDeOrden);
    }

    @GetMapping
    public List<ordenDeCompra> getOrdenesDeCompra() {
        return ordenDeCompraService.getOrdenesDeCompra();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ordenDeCompra postNewOrdenDeCompra(@Valid @RequestBody ordenPostRequestModel postObject) {
        return ordenDeCompraService.addNewOrdenDeCompra(postObject.getCodigosTelefonos(),
                postObject.getClienteDNI(),
                postObject.getNumeroDeOrden());
    }

    @DeleteMapping("/{numeroDeOrden}")
    public void deleteOrdenDeCompra(@Valid @PathVariable int numeroDeOrden) {
        ordenDeCompraService.deleteOrdenDeCompra(numeroDeOrden);
    }
}
