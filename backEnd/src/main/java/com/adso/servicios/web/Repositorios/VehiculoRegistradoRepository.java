package com.adso.servicios.web.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adso.servicios.web.Entidades.VehiculoRegistrado;

public interface VehiculoRegistradoRepository extends JpaRepository<VehiculoRegistrado, Integer> {

}