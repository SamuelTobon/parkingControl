package com.adso.servicios.web.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;
import com.adso.servicios.web.Entidades.Categorias;

public interface CategoriasInt {

    public List<Categorias> findAll();
    public Optional<Categorias> findById(Integer id);
    public Categorias save(Categorias caterorias);
    public void delete(Integer id);

}

