package com.example.exampledependencyinjection.Models.service;

import org.springframework.stereotype.Service;

@Service
public class ServicioAlternativo implements IServicio {

    @Override
    public String operacion() {
        return "Implementación desde servicio alternativo";
    }
    
}
