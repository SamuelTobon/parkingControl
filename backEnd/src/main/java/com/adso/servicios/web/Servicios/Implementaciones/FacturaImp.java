package com.adso.servicios.web.Servicios.Implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adso.servicios.web.Entidades.Factura;
import com.adso.servicios.web.Servicios.Interfaces.FacturaInt;

@Service
public class FacturaImp implements FacturaInt {

    @Override
    public List<FacturaInt> finAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'finAll'");
    }

    @Override
    public void save(Factura factura) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<FacturaInt> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void delete(Factura factura) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
