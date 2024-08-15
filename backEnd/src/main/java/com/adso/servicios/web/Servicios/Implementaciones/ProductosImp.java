package com.adso.servicios.web.Servicios.Implementaciones;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adso.servicios.web.Entidades.Productos;
import com.adso.servicios.web.Repositorios.ProductosRepository;
import com.adso.servicios.web.Servicios.Interfaces.ProductosInt;

@Service
public class ProductosImp implements ProductosInt {

    @Autowired
    private ProductosRepository reporitorio;

    @Override
    public List<Productos> findAll(){
        return reporitorio.findAll();
    }

    @Override
    public Optional<List<Productos>> buscar(String texto){
        return reporitorio.findByNombreLikeOrVencimiento("%"+texto+"%",texto);
    }

    @Override
    public Optional<Productos> findById(Integer id) {
        return reporitorio.findById(id);
    }

    @Override
    public Productos save(Productos producto) {
        return reporitorio.save(producto);
    }

    @Override
    public void delete(Integer id) {
        reporitorio.deleteById(id);
    }

}
