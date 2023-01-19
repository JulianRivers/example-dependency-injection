package com.example.exampledependencyinjection.Models.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Cliente {
    private String nombre;
    private String apellido;
}
