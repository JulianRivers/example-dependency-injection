package com.example.exampledependencyinjection.Models.domain;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Factura {
    private String descripcion;
    private Cliente cliente;
    private List<ItemFactura> itemFactura;
}
