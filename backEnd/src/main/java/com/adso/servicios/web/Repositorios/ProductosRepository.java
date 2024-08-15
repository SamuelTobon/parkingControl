package com.adso.servicios.web.Repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adso.servicios.web.Entidades.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {

     Optional<List<Productos>> findByNombreLikeOrVencimiento(String nombre, String vencimiento);
}
