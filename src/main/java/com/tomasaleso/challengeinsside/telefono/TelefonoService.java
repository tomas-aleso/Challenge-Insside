package com.tomasaleso.challengeinsside.telefono;

import java.util.List;

import com.tomasaleso.challengeinsside.ChallengeInssideApplication;

import org.springframework.stereotype.Service;

@Service
public class TelefonoService {
    
    public List<Telefono> getTelefonos() {
        return ChallengeInssideApplication.telefonos;
    }
    
}
