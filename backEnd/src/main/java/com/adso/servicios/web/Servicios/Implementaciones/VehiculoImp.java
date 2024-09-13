package com.adso.servicios.web.Servicios.Implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adso.servicios.web.Entidades.Vehiculo;
import com.adso.servicios.web.Repositorios.VehiculoRepository;
import com.adso.servicios.web.Servicios.Interfaces.VehiculoInt;

@Service
public class VehiculoImp implements VehiculoInt {

    @Autowired
    private VehiculoRepository servicio;

    @Override
    public List<Vehiculo> findAll() {
        return servicio.findAll();
    }

    @Override
    public Optional<Vehiculo> findById(Integer id) {
        return servicio.findById(id);
    }

    @Override
    public Vehiculo save(Vehiculo vehiculo) {
        return servicio.save(vehiculo);

    }

    @Override
    public void delete(Integer id) {
        servicio.deleteById(id);
    }

}
