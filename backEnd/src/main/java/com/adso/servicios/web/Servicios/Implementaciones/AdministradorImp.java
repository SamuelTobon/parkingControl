package com.adso.servicios.web.Servicios.Implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adso.servicios.web.Entidades.Administradores;
import com.adso.servicios.web.Servicios.Interfaces.AdministradorInt;

@Service
public class AdministradorImp implements AdministradorInt {

    @Override
    public List<AdministradorInt> finAll() {
        return null;
    }

    @Override
    public void save(Administradores administrador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<AdministradorInt> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void delete(Administradores administrador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
