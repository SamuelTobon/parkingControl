package com.adso.servicios.web.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;

import com.adso.servicios.web.Entidades.Administradores;

public interface AdministradorInt {
    public List<AdministradorInt> finAll();

    public void save(Administradores administrador);

    public Optional<AdministradorInt> findById(Integer id);

    public void delete(Administradores administrador);

}
