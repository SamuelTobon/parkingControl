package com.adso.servicios.web.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;

import com.adso.servicios.web.Entidades.HistorialParqueadero;

public interface HistorialParqueaderoInt {
    public List<HistorialParqueadero> finAll();

    public void save(HistorialParqueadero HistorialParqueadero);

    public Optional<HistorialParqueadero> findById(Integer id);

    public void delete(Integer id);

}
