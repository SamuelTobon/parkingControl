package com.adso.servicios.web.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adso.servicios.web.Entidades.HistorialTransacciones;

public interface HistorialTransaccionesRepository extends JpaRepository<HistorialTransacciones, Integer> {

}
