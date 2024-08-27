package com.adso.servicios.web.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adso.servicios.web.Entidades.Factura;
import com.adso.servicios.web.Servicios.Interfaces.FacturaInt;

public interface FacturaRepository extends JpaRepository<FacturaInt, Integer> {
    public void saveFactura(Factura factura);

    public void deleterFactura(Factura factura);

}
