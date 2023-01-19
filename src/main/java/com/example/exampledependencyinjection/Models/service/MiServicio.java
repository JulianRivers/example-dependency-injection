package com.example.exampledependencyinjection.Models.service;

import org.springframework.stereotype.Service;

@Service("miServicioSimple")// <- Fachada Singleton
public class MiServicio implements IServicio{

    public String operacion() {
        return "return de la operación desde MiServicio";
    }
}
