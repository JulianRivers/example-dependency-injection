package com.example.exampledependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
}
