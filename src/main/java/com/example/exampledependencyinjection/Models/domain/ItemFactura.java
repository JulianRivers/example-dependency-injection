package com.example.exampledependencyinjection.Models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemFactura {
    private Producto producto;
    private int cantidad;
}
