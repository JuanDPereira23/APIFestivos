package com.apifestivos.festivos.core.interfaces.servicios;

import java.util.List;

import com.apifestivos.festivos.core.entidades.Festivo;

public interface IFestivoServicio {
    
    public List<Festivo> listar();

    public Festivo obtener(int id);

    public Festivo agregar(Festivo festivo);

    public Festivo modificar(Festivo festivo);

    public boolean eliminar(int id);
}

