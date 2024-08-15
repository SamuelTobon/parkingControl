package com.adso.servicios.web.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;
import com.adso.servicios.web.Entidades.Unidades;

public interface UnidadesInt {

    public List<Unidades> findAll();
    public Optional<Unidades> findById(Integer id);
    public Unidades save(Unidades unidades);
    public void delete(Integer id);

}

