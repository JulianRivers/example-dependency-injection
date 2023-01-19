package com.example.exampledependencyinjection;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.exampledependencyinjection.Models.domain.ItemFactura;
import com.example.exampledependencyinjection.Models.domain.Producto;
import com.example.exampledependencyinjection.Models.service.IServicio;
import com.example.exampledependencyinjection.Models.service.MiServicio;
import com.example.exampledependencyinjection.Models.service.ServicioAlternativo;

@Configuration
public class AppConfig {
    
    @Bean
    @Primary
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean
    public IServicio registrarServicioAlt(){
        return new ServicioAlternativo();
    }

    @Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony", (double) 100);
		Producto producto2 = new Producto("Bicicleta Bianchi aro 26", (double) 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
}
