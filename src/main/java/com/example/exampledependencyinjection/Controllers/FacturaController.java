package com.example.exampledependencyinjection.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.exampledependencyinjection.Models.domain.Cliente;
import com.example.exampledependencyinjection.Models.domain.Factura;

@Controller
public class FacturaController {
    @Autowired
    private Factura factura;

    @GetMapping(value="/factura")
    public String factura(Model model) {
        //Factura de alguna parte
        Cliente c = new Cliente();
        c.setNombre("Julian");
        c.setApellido("Riveros");

        factura.setCliente(c);
        factura.setDescripcion("Factura Deporte");
        
        model.addAttribute("title", "Ejemplo factura");
        model.addAttribute("factura", factura);
        
        return "factura";
    }
}
