package com.adso.servicios.web.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;

import com.adso.servicios.web.Entidades.Factura;

public interface FacturaInt {
    public List<Factura> findAll();

    public Factura save(Factura factura);

    public Optional<Factura> findById(Integer id);

    public void delete(Integer id);

}
