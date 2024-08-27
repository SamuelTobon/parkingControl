package com.adso.servicios.web.Servicios.Implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adso.servicios.web.Entidades.Vehiculo;
import com.adso.servicios.web.Servicios.Interfaces.VehiculoInt;

@Service
public class VehiculoImp implements VehiculoInt {

    @Override
    public List<VehiculoInt> finAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'finAll'");
    }

    @Override
    public Optional<VehiculoInt> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public VehiculoInt save(Vehiculo car) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
