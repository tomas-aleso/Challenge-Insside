package com.tomasaleso.challengeinsside.telefono;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/telefonos")
public class TelefonoController {

    private final TelefonoService telefonoService;

    @Autowired
    public TelefonoController(TelefonoService telefonoService) {
        this.telefonoService = telefonoService;
    }

    @GetMapping
    public List<Telefono> getTelefonos() {
        return telefonoService.getTelefonos();
    }

}
