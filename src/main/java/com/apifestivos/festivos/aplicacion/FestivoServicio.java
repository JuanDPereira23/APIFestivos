package com.apifestivos.festivos.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apifestivos.festivos.core.entidades.Festivo;
import com.apifestivos.festivos.core.interfaces.repositorios.IFestivoRepositorio;
import com.apifestivos.festivos.core.interfaces.servicios.IFestivoServicio;

@Service
public class FestivoServicio implements IFestivoServicio {


    private IFestivoRepositorio repositorio;

    public FestivoServicio(IFestivoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Festivo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Festivo obtener(int id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public Festivo agregar(Festivo festivo) {
        
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public Festivo modificar(Festivo festivo) {
        
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminar(int id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }
    
}
