package com.adso.servicios.web.Servicios.Implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adso.servicios.web.Entidades.Factura;
import com.adso.servicios.web.Repositorios.FacturaRepository;
import com.adso.servicios.web.Servicios.Interfaces.FacturaInt;

@Service
public class FacturaImp implements FacturaInt {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Factura> findAll() {
        return facturaRepository.findAll();

    }

    @Override
    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Optional<Factura> findById(Integer id) {
        return facturaRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        facturaRepository.deleteById(id);

    }

}
