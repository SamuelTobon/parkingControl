package com.adso.servicios.web.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;

import com.adso.servicios.web.Entidades.Vehiculo;

public interface VehiculoInt {
    public List<VehiculoInt> finAll();

    public Optional<VehiculoInt> findById(Integer id);

    public VehiculoInt save(Vehiculo car);

    public void delete(Integer id);

}
