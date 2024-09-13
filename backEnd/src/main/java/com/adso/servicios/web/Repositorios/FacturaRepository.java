package com.adso.servicios.web.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adso.servicios.web.Entidades.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {

}
