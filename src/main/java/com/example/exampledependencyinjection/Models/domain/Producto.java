package com.example.exampledependencyinjection.Models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {
    private String nombre;
    private Double precio;
}
