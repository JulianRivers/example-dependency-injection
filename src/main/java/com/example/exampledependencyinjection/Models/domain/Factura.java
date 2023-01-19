package com.example.exampledependencyinjection.Models.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class Factura {
    private String descripcion;
    private Cliente cliente;
    @Autowired
    private List<ItemFactura> items;

    public Factura(){
        
    }
}
