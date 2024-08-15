package com.adso.servicios.web.Servicios.Implementaciones;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adso.servicios.web.Entidades.Unidades;
import com.adso.servicios.web.Repositorios.UnidadesRepository;
import com.adso.servicios.web.Servicios.Interfaces.UnidadesInt;

@Service
public class UnidadesImp implements UnidadesInt {

    @Autowired
    private UnidadesRepository repositorio;

    @Override
    public List<Unidades> findAll(){
        return repositorio.findAll();
    }

    @Override
    public Optional<Unidades> findById(Integer id) {
        return repositorio.findById(id);
    }

    @Override
    public Unidades save(Unidades unidad) {
        return repositorio.save(unidad);
    }

    @Override
    public void delete(Integer id) {
        repositorio.deleteById(id);
    }

}
