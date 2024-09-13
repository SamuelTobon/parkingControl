package com.adso.servicios.web.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adso.servicios.web.Entidades.Vehiculo;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {

}
