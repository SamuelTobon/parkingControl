package com.adso.servicios.web.Servicios.Implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.adso.servicios.web.Entidades.Administradores;
import com.adso.servicios.web.Repositorios.AdministradorRepository;
import com.adso.servicios.web.Servicios.Interfaces.AdministradorInt;

@Service
public class AdministradorImp implements AdministradorInt {

    @Autowired
    private AdministradorRepository administradorRepository;

    @Override
    public List<Administradores> findAll() {
        return administradorRepository.findAll();
    }

    @Override
    public Administradores save(Administradores administrador) {
        return administradorRepository.save(administrador);

    }

    @Override
    public Optional<Administradores> findById(Integer id) {
        return administradorRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        administradorRepository.deleteById(id);
    }

<<<<<<< HEAD
    @Override
    public Optional<List<Administradores>> buscar(String texto) {
        return administradorRepository.findByNombre(texto);

    }
}
