package com.tomasaleso.challengeinsside.cliente;

import java.util.List;

import com.tomasaleso.challengeinsside.ChallengeInssideApplication;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    public List<Cliente> getClientes() {
        return ChallengeInssideApplication.clientes;
    }

}
