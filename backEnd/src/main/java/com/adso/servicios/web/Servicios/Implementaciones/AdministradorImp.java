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

    @Override
    public Optional<List<Administradores>> buscar(String texto) {
        return administradorRepository.findByNombre(texto);

    }

    @Override
    public Optional<Administradores> findByEmail(String email) {
        return administradorRepository.findByEmail(email);

    }

    @Override
    public boolean validarCredenciales(String email, String password) {
        Optional<Administradores> usuarioOpt = administradorRepository.findByEmail(email);
        if (usuarioOpt.isPresent()) {
            Administradores usuario = usuarioOpt.get();
            return usuario.getPassword().equals(password);
        }
        return false;
    }
}
