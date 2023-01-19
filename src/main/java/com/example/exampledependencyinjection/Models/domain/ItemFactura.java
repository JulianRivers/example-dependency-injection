package com.example.exampledependencyinjection.Models.domain;

import lombok.Data;

@Data
public class ItemFactura {
    private Producto producto;
    private Integer cantidad;
}
