package com.apifestivos.festivos.presentacion;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apifestivos.festivos.core.entidades.Festivo;
import com.apifestivos.festivos.core.interfaces.servicios.IFestivoServicio;

import java.util.List;

@RestController
@RequestMapping("/api/festivos")
public class FestivoControlador {
    
    private IFestivoServicio servicio;

    public FestivoControlador(IFestivoServicio servicio){
        this.servicio = servicio;
    }

    @RequestMapping(value="/listar", method=RequestMethod.GET)
    public List<Festivo> listar() {
        return servicio.listar();      
    }

}
