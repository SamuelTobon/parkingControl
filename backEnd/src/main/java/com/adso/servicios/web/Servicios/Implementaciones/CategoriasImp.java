package com.adso.servicios.web.Servicios.Implementaciones;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adso.servicios.web.Entidades.Categorias;
import com.adso.servicios.web.Repositorios.CategoriasRepository;
import com.adso.servicios.web.Servicios.Interfaces.CategoriasInt;

@Service
public class CategoriasImp implements CategoriasInt {

    @Autowired
    private CategoriasRepository repositorio;

    @Override
    public List<Categorias> findAll(){
        return repositorio.findAll();
    }

    @Override
    public Optional<Categorias> findById(Integer id) {
        return repositorio.findById(id);
    }

    @Override
    public Categorias save(Categorias categoria) {
        return repositorio.save(categoria);
    }

    @Override
    public void delete(Integer id) {
        repositorio.deleteById(id);
    }

}
