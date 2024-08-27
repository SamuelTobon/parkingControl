package com.adso.servicios.web.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;

import com.adso.servicios.web.Entidades.Parqueadero;

public interface ParqueaderoInt {

    public List<ParqueaderoInt> findAll();

    public Optional<ParqueaderoInt> findById(Integer id);

    public ParqueaderoInt save(Parqueadero parqueadero);

    public void delete(Parqueadero parqueadero);

}
