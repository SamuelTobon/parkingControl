package com.adso.servicios.web.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;

public interface FacturaInt {
    public List<FacturaInt> finAll();

    public void save(FacturaInt factura);

    public Optional<FacturaInt> findById(Integer id);

    public void delete(Integer id);

}
